import java.util.Scanner;

public class Main {
	
	
	public static void setNameSetCast(Player p1){
		System.out.println("Player name: ");
		Scanner sc = new Scanner(System.in);
		p1.setName(sc.nextLine());
		System.out.println("Válassz castot: 1-Tank 2-Mágus 3-Orgyilkos");
		int cast=sc.nextInt();
		while(cast<1 || cast>4){
			System.out.println("1-2-3 Közül Válaszz!");
			cast=sc.nextInt();
		}
		if(cast==1) {
			p1.setCast("Tank");	
		} else if(cast==2){
			p1.setCast("Magus");	
		} else {
			p1.setCast("Orgyilkos");
		}
		

	}
	
	public static void fightTillTheEnd(Player p1, Harcos h1) {
		int szam = Methods.rdm(0,1);
		if (szam==0) {
			do {
				p1.tamad(h1);
				h1.tamad(p1);
			}while(p1.isAlive() && h1.isAlive());
		}else{
			do {
				h1.tamad(p1);
				p1.tamad(h1);
			}while(p1.isAlive() && h1.isAlive());
		}
		
		if(p1.isAlive()) {
			p1.setGold(p1.getGold()+h1.getGold());
			p1.setXp(p1.getXp()+h1.getXp());
			p1.setLevel(p1.getXp());
			p1.levelUP();
			p1.regen();
			System.out.println("Gyõztél");
		}else {
			System.out.println("Vesztettél");
			System.out.println("Ennyit sikerült összeszedni: " +p1.getXp());
		}
	}
	
	public static Harcos generateHarcos(int p1level) {
		int szam=Methods.rdm(0, 2);
		int level=Methods.rdm(p1level, p1level+1);
		if(szam==0)
			return new Tank(level);	
		else if (szam==1)
			return new Magus(level);
		else
			return new Orgyilkos(level);
	}
	
	public static Harcos chooseHarcos(Player p1) {
		System.out.println("Válassz enemyt: ");
		Harcos h1 = generateHarcos(p1.getLevel());
		System.out.println("1." + h1 );
		Harcos h2 = generateHarcos(p1.getLevel());
		System.out.println("2." + h2);
		Harcos h3 = generateHarcos(p1.getLevel());
		System.out.println("3." + h3);
		Harcos h4 = generateHarcos(p1.getLevel());
		System.out.println("4." + h4);
		Scanner sc = new Scanner(System.in);
		int choose=sc.nextInt();
		switch(choose) {	
			case 1: return h1;
			case 2: return h2;
			case 3: return h3;
			default: return h4;
		}

	}
	
	public static void shop(Player p1, Item[] items) {
		System.out.println("Vásárlás: ");
		for (int i=0; i<items.length; i++) {
			System.out.print(i+1+". ");
			System.out.print(items[i]+"\n");
		}
		Scanner sc= new Scanner(System.in);
		int szam=sc.nextInt();
		if (szam>0 && szam<items.length+1 && p1.getGold()>items[szam-1].getGold())
			p1.buy(items[szam-1]);
		
	}
	

	
	public static void main(String[] args) {
		
		//EZ KELL
		//Player p1 = new Player();
		//setNameSetCast(p1);
		Item[] items = {new Item("ShotSword",50,20,0),
						new Item("LongSword",50,20,0)
						};
		Player p1 = new Player("Magus","Berci"); //EZ MAJD DhpE
		System.out.println(p1);
		
		for (int i=0; i<1; i++) {
			if(p1.isAlive()==false) break;
			fightTillTheEnd(p1,chooseHarcos(p1));
			System.out.println(p1);
			shop(p1,items);
			System.out.println(p1);
		}
		
		
		
		
		//BOSS FIGHT
//		Boss b1 = new Boss();
//		System.out.println(b1);
//		fightTillTheEnd(p1,b1);
		
	}

}

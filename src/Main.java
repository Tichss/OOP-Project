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
		System.out.println("Választható ellenséges harcosok: ");
		Harcos h1 = generateHarcos(p1.getLevel());
		System.out.println("1." + h1 );
		Harcos h2 = generateHarcos(p1.getLevel());
		System.out.println("2." + h2);
		Harcos h3 = generateHarcos(p1.getLevel());
		System.out.println("3." + h3);
		Harcos h4 = generateHarcos(p1.getLevel());
		System.out.println("4." + h4);
		System.out.println("*****************************");
		System.out.println("5. Új Harcosokat kérek! Ár: 5 gold");
		Scanner sc = new Scanner(System.in);
		int choose;
		do {
			System.out.println("Válasszd ki kivel szeretnél harcolni (1-4)!");
			choose=sc.nextInt();
			if (choose==5 && p1.getGold()>=5) {
				p1.setGold(p1.getGold()-5);
				return null;
			}else if(choose==5 && p1.getGold()<5) {
				System.out.println("Nincs elég goldod");
			}
		}while(choose<1 || choose>4);
		
		
		switch(choose) {	
			case 1: return h1;
			case 2: return h2;
			case 3: return h3;
			default: return h4;
		}

	}
	
	public static void shop(Player p1, Item[] items) {
		
		Scanner sc= new Scanner(System.in);
		char yesOrNo;
		do {	
			System.out.println("Szeretnél (még) vásárolni? (Y/N)\nJelenlegi vagyonod: "+p1.getGold() +" gold");
			do {
				yesOrNo=sc.next().charAt(0); 
			}while(yesOrNo!='Y' && yesOrNo!='N');
			
			if(yesOrNo=='Y') {
				System.out.println("A megvehetõ tárgyak listája: ");
				for (int i=0; i<items.length; i++) {
					
					System.out.println(i+1+". "+items[i]);
				}
				
				Scanner sc1= new Scanner(System.in);
				int szam;
				szam=sc1.nextInt();
				if(szam>0 && szam<items.length+1) {
					if (p1.getGold()>items[szam-1].getGold()) {
						System.out.println("Megvetted: "+items[szam-1].getName());
						p1.buy(items[szam-1]);	
					}else {
						System.out.println("Erre nincs elég goldod...");		
					}
				}else {
					System.out.println("Nincs ilyen item...");
				}
			}	
		}while(yesOrNo!='N');
}
	

	
	public static void main(String[] args) {
		
		//EZ KELL
		//Player p1 = new Player();
		//setNameSetCast(p1);
		
		Item[] items = {new Item("SmallMedKit",15,0,15),
		                new Item("MediumMedKit",25,0,30),
		                new Item("HardMedKit",40,0,50),
		                new Item("HpOverPower",70,0,120),
		                new Item("DudeThatsHP",130,0,250),
		
		                new Item("KisKard",15,5,0),
		                new Item("Landzsa",30,15,0),
		                new Item("Baltácska",55,30,0),
		                new Item("Baltaa",100,70,0),
		                new Item("EXcalibur",150,150,0)
						};
		
		//EZ MAJD NEM KELL
		Player p1 = new Player("Magus","Berci"); 
		
		
		Harcos h1= null;

		System.out.println(p1);
		int i=0;
		for (i=0; i<7; i++) {
			shop(p1,items);
			do {
				h1=chooseHarcos(p1);
			}while(h1==null);
			p1.fightTillTheEnd(h1);
			System.out.println(p1);
			if(p1.isAlive()==false) break;
		}
		
		if(i==7) {
			//BOSS FIGHT
			Boss b1 = new Boss();
			System.out.println("Végsõ küzdelem:");
			System.out.println(b1);
			p1.fightTillTheEnd(b1);	
		}
	}

}

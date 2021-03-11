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

	public static void main(String[] args) {
		
		Player p1 = new Player();
		setNameSetCast(p1);
		System.out.println(p1);


//		Tank t1= new Tank(1);
//		System.out.println(t1);
//		Magus m1 = new Magus(1);
//		Magus m2 = new Magus(1);
//		Magus m3 = new Magus(1);
//		System.out.println(m1);
//		System.out.println(m2);
//		System.out.println(m3);
	}

}

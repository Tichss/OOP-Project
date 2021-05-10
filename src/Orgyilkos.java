public class Orgyilkos extends Harcos{
	
	static String[] names= {"Katarina", "Bayek", "Eivor", "Hitman", "Talon", "Zed", "Akali", "Kha Zhix", "Rengar", "Phantomblade", "Deadcrash", "Silentstrikes", "Lightningtooth", "Quickflow", "Deatheyes", "Ghost Eye", "Ghostshade", "Goldenstrikes", "Scarletbeat", "The Deadly Blaze", "The Quick Snake", "Thunder Moon", "The Masked Mark", "The Swift Snow", "Dead Bang", "The Blue Serpent", "The Ghost Assassin", "The Veiled Spider"};
	
	//seged statcicek
	static int volteNameCount=0; 
	static String[] volteName = new String [names.length];
	
	protected String name;

    Orgyilkos(){}
    Orgyilkos(int level){
    	
    	this.cast="Orgyilkos";

        switch (level){
        case 1:
        	this.name=setName();
            this.level=1;
            this.minDamage=50;
            this.maxDamage=60;
            this.hp=150;
            this.hitChance=80;
            this.xp=60;
            this.gold=25;
            break;
        case 2:
        	this.name=setName();
            this.level=2;
            this.minDamage=80;
            this.maxDamage=90;
            this.hp=230;
            this.hitChance=80;
            this.xp=70;
            this.gold=35;
            break;
        case 3:
        	this.name=setName();
            this.level=3;
            this.minDamage=100;
            this.maxDamage=120;
            this.hp=310;
            this.hitChance=80;
            this.gold=50;
            this.xp=80;
            break;
        case 4:
        	this.name=setName();
            this.level=4;
            this.minDamage=130;
            this.maxDamage=145;
            this.hp=390;
            this.hitChance=80;
            this.gold=65;
            this.xp=90;
            break;
        case 5:
            this.name=setName();
            this.level=5;
            this.minDamage=160;
            this.maxDamage=180;
            this.hp=470;
            this.hitChance=80;
            this.gold=75;
            this.xp=100;
            break;
        case 6:
            this.name=setName();
            this.level=6;
            this.minDamage=200;
            this.maxDamage=215;
            this.hp=550;
            this.hitChance=80;
            this.gold=85;
            this.xp=110;
            break;
        case 7:
            this.name=setName();
            this.level=7;
            this.minDamage=220;
            this.maxDamage=240;
            this.hp=620;
            this.hitChance=80;
            this.gold=95;
            this.xp=120;
            break;
        case 8:
        	this.name=setName();
            this.level=8;
            this.minDamage=250;
            this.maxDamage=265;
            this.hp=710;
            this.hitChance=80;
            this.gold=100;
            this.xp=130;
            break;
        case 9:
        	this.name=setName();
            this.level=9;
            this.minDamage=290;
            this.maxDamage=310;
            this.hp=800;
            this.hitChance=80;
            this.gold=110;
            this.xp=140;
            break;
        }
        
    }
    public String setName() {
    	int rdmszam = (int)(Math.random() * (names.length));
    	int newRdmszam;
    	String name = names[rdmszam];
    	for (int i=0; i<=volteNameCount; i++) {
    		if (name==volteName[i]) {
    			do {
    				newRdmszam = (int)(Math.random() * (names.length));
    			}while(rdmszam==newRdmszam);
    			name = names[newRdmszam];
    		}
    	}
    	volteName[volteNameCount]=name;
    	volteNameCount++;
    	return name;
    }
    
    public String toString(){
    	return super.toString() + " neve: "+ name;
    }

}
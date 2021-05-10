
public class Tank extends Harcos{
	
	static String[] names= {"Spartacus", "Kratos", "Conor McGregor", "Khabib Nurmagomedow", "Bruce Wayne", "Doom Guy", "Hulk", "Thanos", "Ríviai Gerald", "Fugrog", "Wesmohr", "Alezmalog", "Vedius", "Zutor", "Zemalog", "Kaxfur", "Ikaos", "Xiog", "Telwor", "Zlelog", "Slemvog", "Bogsal", "Ninar", "Zekrus", "Klobos", "Wemrus", "Rawar", "Vrumtag"};
	
	//seged statcicek
	static int volteNameCount=0; 
	static String[] volteName = new String [names.length];
	
	protected String name;
	
    Tank(){}
    Tank(int level){
    	
    	this.cast="Tank";

        switch (level){
        case 1:
        	this.name=setName();
            this.level=1;
            this.minDamage=30;
            this.maxDamage=40;
            this.hp=225;
            this.hitChance=90;
            this.xp=50;
            this.gold=10;
            break;
        case 2:
        	this.name=setName();
            this.level=2;
            this.minDamage=50;
            this.maxDamage=60;
            this.hp=350;
            this.hitChance=90;
            this.xp=60;
            this.gold=15;
            break;
        case 3:
        	this.name=setName();
        	this.level=3;
            this.minDamage=70;
            this.maxDamage=80;
            this.hp=470;
            this.hitChance=90;
            this.xp=60;
            this.gold=25;      
            break;
        case 4:
        	this.name=setName();
            this.level=4;
            this.minDamage=90;
            this.maxDamage=100;
            this.hp=590;
            this.hitChance=90;
            this.gold=35;
            this.xp=70;
            break;
        case 5:
        	this.name=setName();
            this.level=5;
            this.minDamage=110;
            this.maxDamage=120;
            this.hp=710;
            this.hitChance=90;
            this.gold=40;
            this.xp=80;
            break;
       
        case 6:
        	this.name=setName();
            this.level=6;
            this.minDamage=130;
            this.maxDamage=140;
            this.hp=830;
            this.hitChance=90;
            this.xp=90;
            this.gold=45;
            break;
        case 7:
        	this.name=setName();
            this.level=7;
            this.minDamage=150;
            this.maxDamage=160;
            this.hp=950;
            this.hitChance=90;
            this.xp=100;
            this.gold=50;
            break;
        case 8:
        	this.name=setName();
            this.level=8;
            this.minDamage=170;
            this.maxDamage=180;
            this.hp=1070;
            this.hitChance=90;
            this.xp=110;
            this.gold=55;
            break; 
       case 9:
    	    this.name=setName();
            this.level=9;
            this.minDamage=190;
            this.maxDamage=210;
            this.hp=1200;
            this.hitChance=90;
            this.gold=65;
            this.xp=110;
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

public class Magus extends Harcos{
	
	static String[] names= {"Harry Potter", "Voldemort", "Gandalf", "Medivh", "Khadgar", "Scarlet Witch", "Demona", "Goethius Salmander", "Gellert Grindelwald", "Warlock", "Mystiques", "Mystics", "Arcani", "Magius", "Auroras", "Illusionary", "Druids", "Occultists", "Obi", "Hocus", "Divina", "Sages", "Runi", "Ardor", "Vasati Fentumal", "Sillavana Helenelis", "Ailre Helenorin"};
	
	//seged statcicek
	static int volteNameCount=0; 
	static String[] volteName = new String [names.length];
	
	
	protected String name;
	
    Magus(){}
    
    Magus(int level){
    	
    	this.cast="Magus";
    	
        switch (level){
        case 1:
        	this.name=setName();
            this.level=1;
            this.minDamage=40;
            this.maxDamage=50;
            this.hp=175;
            this.hitChance=85;
            this.gold=20;
            this.xp=60;
            break;
        case 2:
        	this.name=setName();
            this.level=2;
            this.minDamage=60;
            this.maxDamage=80;
            this.hp=270;
            this.hitChance=85;
            this.gold=30;
            this.xp=60;
            break;
        case 3:
        	this.name=setName();
            this.level=3;
            this.minDamage=80;
            this.maxDamage=100;
            this.hp=360;
            this.hitChance=85;
            this.gold=40;
            this.xp=70;
            break;
        case 4:
        	this.name=setName();
            this.level=4;
            this.minDamage=120;
            this.maxDamage=140;
            this.hp=460;
            this.hitChance=85;
            this.gold=50;
            this.xp=70;
            break;
        case 5:
        	this.name=setName();
            this.level=5;
            this.minDamage=140;
            this.maxDamage=160;
            this.hp=550;
            this.hitChance=85;
            this.gold=60;
            this.xp=80;
            break;
        case 6:
        	this.name=setName();
            this.level=6;
            this.minDamage=160;
            this.maxDamage=180;
            this.hp=640;
            this.hitChance=85;
            this.gold=70;
            this.xp=90;
            break;
        case 7:
        	this.name=setName();
            this.level=7;
            this.minDamage=180;
            this.maxDamage=200;
            this.hp=750;
            this.hitChance=85;
            this.gold=80;
            this.xp=100;
            break;
        case 8:
        	this.name=setName();
            this.level=8;
            this.minDamage=200;
            this.maxDamage=220;
            this.hp=840;
            this.hitChance=85;
            this.gold=85;
            this.xp=120;
            break;
        case 9:
        	this.name=setName();
            this.level=9;
            this.minDamage=230;
            this.maxDamage=260;
            this.hp=950;
            this.hitChance=85;
            this.gold=90;
            this.xp=130;
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
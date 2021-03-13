public class Magus extends Harcos{
	
	static String[] names= {"Harry Potter", "Voldemort", "Gandalf", "Medivh", "Khadgar", "Scarlet Witch", "Demona", "Goethius Salmander", "Gellert Grindelwald"};
	
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
            this.minDamage=2;
            this.maxDamage=4;
            this.hp=8;
            this.hitChance=60;
            this.xp=30;
            break;
        case 2:
        	this.name=setName();
            this.level=2;
            this.minDamage=2;
            this.maxDamage=4;
            this.hp=10;
            this.hitChance=60;
            break;
        case 3:
        	this.name=setName();
            this.level=3;
            this.minDamage=3;
            this.maxDamage=5;
            this.hp=13;
            this.hitChance=60;
            break;
        case 4:
        	this.name=setName();
            this.level=4;
            this.minDamage=3;
            this.maxDamage=6;
            this.hp=15;
            this.hitChance=60;
            break;
        case 5:
        	this.name=setName();
            this.level=5;
            this.minDamage=4;
            this.maxDamage=6;
            this.hp=18;
            this.hitChance=60;
            break;
        case 6:
        	this.name=setName();
            this.level=6;
            this.minDamage=4;
            this.maxDamage=6;
            this.hp=20;
            this.hitChance=55;
            break;
        case 7:
        	this.name=setName();
            this.level=7;
            this.minDamage=5;
            this.maxDamage=7;
            this.hp=23;
            this.hitChance=50;
            break;
        case 8:
        	this.name=setName();
            this.level=8;
            this.minDamage=6;
            this.maxDamage=7;
            this.hp=25;
            this.hitChance=55;
            break;
        case 9:
        	this.name=setName();
            this.level=9;
            this.minDamage=8;
            this.maxDamage=8;
            this.hp=30;
            this.hitChance=50;
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
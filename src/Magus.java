public class Magus extends Harcos{
	
	static String[] names= {"asd","qwe","tre"};
	
	//seged statcicek
	static int volteNameCount=0; 
	static String[] volteName = new String [names.length];
	
	
	protected String name;
	
    Magus(){}
    
    Magus(int level){
    	
        switch (level){
        case 1:
        	this.name=setName();
            this.level=1;
            this.minSebzes=2;
            this.maxSebzes=4;
            this.elet=8;
            this.hitChance=60;
            this.xpValue=30;
            break;
        case 2:
        	this.name=setName();
            this.level=2;
            this.minSebzes=2;
            this.maxSebzes=4;
            this.elet=10;
            this.hitChance=60;
            break;
        case 3:
        	this.name=setName();
            this.level=3;
            this.minSebzes=3;
            this.maxSebzes=5;
            this.elet=13;
            this.hitChance=60;
            break;
        case 4:
        	this.name=setName();
            this.level=4;
            this.minSebzes=3;
            this.maxSebzes=6;
            this.elet=15;
            this.hitChance=60;
            break;
        case 5:
        	this.name=setName();
            this.level=5;
            this.minSebzes=4;
            this.maxSebzes=6;
            this.elet=18;
            this.hitChance=60;
            break;
        case 6:
        	this.name=setName();
            this.level=6;
            this.minSebzes=4;
            this.maxSebzes=6;
            this.elet=20;
            this.hitChance=55;
            break;
        case 7:
        	this.name=setName();
            this.level=7;
            this.minSebzes=5;
            this.maxSebzes=7;
            this.elet=23;
            this.hitChance=50;
            break;
        case 8:
        	this.name=setName();
            this.level=8;
            this.minSebzes=6;
            this.maxSebzes=7;
            this.elet=25;
            this.hitChance=55;
            break;
        case 9:
        	this.name=setName();
            this.level=9;
            this.minSebzes=8;
            this.maxSebzes=8;
            this.elet=30;
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
    	return "level: "+ level + super.toString() + " neve: "+ name;
    }

}
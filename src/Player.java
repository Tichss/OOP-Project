
public class Player extends Harcos{
	
	private String name;
	private String cast;
	private int xp;
	

	Player(){}
	Player(String cast, String name){	
		
		this.name=name;
		setCast(cast);
		this.xp=0;	
	}
	
	
	
	//SETTER GETTER
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
        switch (cast){
        
        case "Tank":
            this.level=1;
            this.minSebzes=2;
            this.maxSebzes=4;
            this.elet=10;
            this.hitChance=60;
            break;
            
        case "Magus":;
            this.level=1;
            this.minSebzes=2;
            this.maxSebzes=4;
            this.elet=8;
            this.hitChance=60;
            break;

        case "Orgyilkos":
            this.level=1;
            this.minSebzes=3;
            this.maxSebzes=5;
            this.elet=13;
            this.hitChance=60;
            break;
        }
		
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	
	
	
	
	
	
	public String toString() {
    	return "nevem: "+ this.name + " castom: " + this.cast + super.toString();
    }
}

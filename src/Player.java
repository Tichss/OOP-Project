
public class Player extends Harcos{
	
	private int maxHp;
	private String name;
	

	Player(){}
	Player(String cast, String name){	
		
		this.name=name;
		setCast(cast);
		this.xp=0;
		this.gold=300;
	}
	
	
	
	//SETTER GETTER
	
	
	
    public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getCast() {return cast;}
	public void setCast(String cast) {
		
		this.cast = cast;
		this.level=1;
        switch (cast){
        
        case "Tank":
            this.minDamage=2;
            this.maxDamage=4;
            this.maxHp=10;
            this.hitChance=60;
            break;
            
        case "Magus":;
            this.minDamage=2;
            this.maxDamage=4;
            this.maxHp=8;
            this.hitChance=60;
            break;

        case "Orgyilkos":
            this.minDamage=3;
            this.maxDamage=5;
            this.maxHp=13;
            this.hitChance=60;
            break;
        }
        
        this.hp=this.maxHp;
		
	}
	
	public int getXp() {return xp;}
	public void setXp(int xp) {this.xp = xp;}
	
	public int getMaxHp() {return maxHp;}
	public void setMaxHp(int maxHp) {this.maxHp = maxHp;}
	
	
	//OTHER METHODS
	
	public void regen() {
		this.hp=this.maxHp;
	}
	
	public String toString() {
    	return "nevem: "+ this.name +" " + super.toString() + " XP: " + this.xp;
    }
	
	
}

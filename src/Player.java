
public class Player extends Harcos{
	
	private int maxHp;
	private String name;
	

	Player(){}
	Player(String cast, String name){	
		
		this.name=name;
		setCast(cast);
		this.xp=0;
		this.gold=50;
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
            
        case "Magus":
            this.minDamage=10;
            this.maxDamage=20;
            this.maxHp=15;
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
	
	public void levelUP() {
		switch(this.cast) {
		case "Tank":
			switch(this.level) {
			
			case 2: this.minDamage=8;
			this.maxDamage=9;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 3: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 4: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 5: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 6: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 7: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 8: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 9: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			}
			break;
		case "Magus":
			switch(this.level) {
			
			case 2: this.minDamage=15;
			this.maxDamage=30;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 3: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 4: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 5: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 6: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 7: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 8: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 9: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			}
			break;
		case "Orgyilkos":
			switch(this.level) {
			
			case 2: this.minDamage=10;
			this.maxDamage=15;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 3: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 4: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 5: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 6: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 7: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 8: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			
			case 9: this.minDamage=2;
			this.maxDamage=4;
			this.maxHp=8;
			this.hitChance=60;
			break;
			}
			break;	
		}	
	}
	
	@Override
	public void setLevel(int xp){
		if (this.xp>1000) level = 10;
		else if(this.xp>800) level=9;
		else if(this.xp>800) level=9;
		else if(this.xp>800) level=9;
		else if(this.xp>800) level=9;
		else if(this.xp>20) level=2;
	}
	
	public void buy(Item i1) {
		this.gold-=i1.getGold();
		this.minDamage+=i1.getPlusDamage();
		this.maxDamage+=i1.getPlusDamage();
		this.hp+=i1.getPlusHp();
	}
	
	public String toString() {
    	return "Nevem: "+ this.name +" " + super.toString() + " XP: " + this.xp+" Gold: " + this.gold;
    }

	
}

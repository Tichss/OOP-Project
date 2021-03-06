
public class Player extends Harcos{
	
	private int maxHp;
	private String name;
	

	Player(){
		this.level=1;
		this.xp=0;
		this.gold=65;

	}
	Player(String cast, String name){
		
		this();
		this.cast=cast;
		this.name=name;
		levelUP();
		regen();
	}
	
	
	
	//SETTER GETTER
	
	
	
    public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getCast() {return cast;}
	public void setCast(String cast) {this.cast=cast;}
	
	public int getXp() {return xp;}
	public void setXp(int xp) {this.xp = xp;}
	
	public int getMaxHp() {return maxHp;}
	public void setMaxHp(int maxHp) {this.maxHp = maxHp;}
	
	
	
	//OTHER METHODS
	
	public void regen() {this.hp=this.maxHp;}
	
	public void levelUP() {
		switch(this.cast) {
		case "Tank":
			switch(this.level) {
			
			case 1: this.minDamage=25;
		            this.maxDamage=35;
		            this.maxHp=200;
		            this.hitChance=90;
		            break;
			
			case 2: this.minDamage+=15;
					this.maxDamage+=15;
					this.maxHp+=50;
					this.hitChance=90;
					break;
			
			case 3: this.minDamage+=10;
					this.maxDamage+=20;
					this.maxHp+=70;
					this.hitChance=90;
					break;
			
			case 4: this.minDamage+=20;
					this.maxDamage+=10;
					this.maxHp+=80;
					this.hitChance=90;
					break;
			
			case 5: this.minDamage+=10;
					this.maxDamage+=20;
					this.maxHp+=70;
					this.hitChance=90;
					break;
			
			case 6: this.minDamage+=30;
					this.maxDamage+=20;
					this.maxHp+=80;
					this.hitChance=90;
					break;
			
			case 7: this.minDamage+=10;
					this.maxDamage+=20;
					this.maxHp+=80;
					this.hitChance=90;
					break;
			
			case 8: this.minDamage+=20;
					this.maxDamage+=20;
					this.maxHp+=120;
					this.hitChance=90;
					break;
			
			case 9: this.minDamage+=20;
					this.maxDamage+=10;
					this.maxHp+=150;
					this.hitChance=90;
					break;
			}
			break;
			
		case "Magus":
			switch(this.level) {
			
			case 1: this.minDamage=30;
		            this.maxDamage=40;
		            this.maxHp=170;
		            this.hitChance=85;
		            break;
			
			case 2: this.minDamage+=20;
					this.maxDamage+=20;
					this.maxHp+=40;
					this.hitChance=85;
					break;
			
			case 3: this.minDamage+=20;
					this.maxDamage+=30;
					this.maxHp+=60;
					this.hitChance=85;
					break;
			
			case 4: this.minDamage+=30;
					this.maxDamage+=30;
					this.maxHp+=70;
					this.hitChance=85;
					break;
			
			case 5: this.minDamage+=20;
					this.maxDamage+=20;
					this.maxHp+=80;
					this.hitChance=85;
					break;
			
			case 6: this.minDamage+=20;
					this.maxDamage+=20;
					this.maxHp+=60;
					this.hitChance=85;
					break;
			
			case 7: this.minDamage+=20;
					this.maxDamage+=20;
					this.maxHp+=70;
					this.hitChance=85;
					break;
			
			case 8: this.minDamage+=20;
					this.maxDamage+=20;
					this.maxHp+=90;
					this.hitChance=85;
					break;
			
			case 9: this.minDamage=200;
					this.maxDamage=220;
					this.maxHp+=80;
					this.hitChance=85;
					break;
			}
			break;
			
		case "Orgyilkos":
			switch(this.level) {
			
			case 1: this.minDamage=50;
		            this.maxDamage=60;
		            this.maxHp=140;
		            this.hitChance=80;
		            break;
			
			case 2: this.minDamage+=25;
					this.maxDamage+=25;
					this.maxHp+=40;
					this.hitChance=80;
					break;
			
			case 3: this.minDamage+=15;
					this.maxDamage+=25;
					this.maxHp+=45;
					this.hitChance=80;
					break;
			
			case 4: this.minDamage+=30;
					this.maxDamage+=40;
					this.maxHp+=50;
					this.hitChance=85;
					break;
			
			case 5: this.minDamage+=40;
					this.maxDamage+=30;
					this.maxHp+=50;
					this.hitChance=80;
					break;
			
			case 6: this.minDamage+=30;
					this.maxDamage+=30;
					this.maxHp+=50;
					this.hitChance=80;
					break;
			
			case 7: this.minDamage+=50;
					this.maxDamage+=50;
					this.maxHp+=50;
					this.hitChance=80;
					break;
			
			case 8: this.minDamage+=20;
					this.maxDamage+=20;
					this.maxHp+=75;
					this.hitChance=85;
					break;
			
			case 9: this.minDamage+=20;
					this.maxDamage+=20;
					this.maxHp+=75;
					this.hitChance=80;
					break;
			}
			break;	
		}	
	}
	
	@Override
	public void setLevel(int xp){
		if (this.xp>=760) level = 9;
		else if(this.xp>620)  {level=8; levelUP();}
		else if(this.xp>=500) {level=7; levelUP();}
		else if(this.xp>=400) {level=6; levelUP();}
		else if(this.xp>=310) {level=5; levelUP();}
		else if(this.xp>=220) {level=4; levelUP();}
		else if(this.xp>=130) {level=3; levelUP();}
		else if(this.xp>=60)  {level=2; levelUP();}
	}
	
	public void fightTillTheEnd(Harcos h1) {
		int szam = Methods.rdm(0,1);
		if (szam==0) {
			do {
				this.tamad(h1);
				h1.tamad(this);
			}while(this.isAlive() && h1.isAlive());
		}else{
			do {
				h1.tamad(this);
				this.tamad(h1);
			}while(this.isAlive() && h1.isAlive());
		}
		
		if(super.isAlive()) {
			this.gold += h1.getGold();
			this.xp += h1.getXp();
			this.setLevel(this.xp); //mindk?pp this.setlevel
			this.regen();
			System.out.println("Gy?zt?l");
		}else {
			System.out.println("Vesztett?l");
			System.out.println("Ennyit siker?lt ?sszeszedni: " + this.xp);
		}
	}
	
	public void buy(Item i1) {
		this.gold-=i1.getGold();
		this.minDamage+=i1.getPlusDamage();
		this.maxDamage+=i1.getPlusDamage();
		this.maxHp+=i1.getPlusHp();
	}
	
	public String toString() {
    	return "Nevem: "+ this.name +" " + super.toString() + " XP: " + this.xp+" Gold: " + this.gold;
    }

	
}

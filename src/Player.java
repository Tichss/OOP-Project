
public class Player extends Harcos{
	
	private int maxHp;
	private String name;
	

	Player(){}
	Player(String cast, String name){	
		
		this.name=name;
		setCast(cast);
		this.xp=0;
		this.gold=4;
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
            this.minDamage=25;
            this.maxDamage=35;
            this.maxHp=180;
            this.hitChance=90;
            break;
            
        case "Magus":
            this.minDamage=30;
            this.maxDamage=40;
            this.maxHp=140;
            this.hitChance=85;
            break;

        case "Orgyilkos":
            this.minDamage=40;
            this.maxDamage=50;
            this.maxHp=100;
            this.hitChance=80;
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
			
			case 2: this.minDamage=40;
					this.maxDamage=50;
					this.maxHp=250;
					this.hitChance=90;
					break;
			
			case 3: this.minDamage=50;
					this.maxDamage=70;
					this.maxHp=320;
					this.hitChance=90;
					break;
			
			case 4: this.minDamage=70;
					this.maxDamage=80;
					this.maxHp=400;
					this.hitChance=90;
					break;
			
			case 5: this.minDamage=80;
					this.maxDamage=100;
					this.maxHp=470;
					this.hitChance=90;
					break;
			
			case 6: this.minDamage=110;
					this.maxDamage=120;
					this.maxHp=550;
					this.hitChance=90;
					break;
			
			case 7: this.minDamage=120;
					this.maxDamage=140;
					this.maxHp=630;
					this.hitChance=90;
					break;
			
			case 8: this.minDamage=140;
					this.maxDamage=160;
					this.maxHp=750;
					this.hitChance=90;
					break;
			
			case 9: this.minDamage=160;
					this.maxDamage=170;
					this.maxHp=900;
					this.hitChance=90;
					break;
			}
			break;
			
		case "Magus":
			switch(this.level) {
			
			case 2: this.minDamage=50;
					this.maxDamage=60;
					this.maxHp=220;
					this.hitChance=85;
					break;
			
			case 3: this.minDamage=70;
					this.maxDamage=490;
					this.maxHp=280;
					this.hitChance=85;
					break;
			
			case 4: this.minDamage=100;
					this.maxDamage=120;
					this.maxHp=350;
					this.hitChance=85;
					break;
			
			case 5: this.minDamage=120;
					this.maxDamage=140;
					this.maxHp=430;
					this.hitChance=85;
					break;
			
			case 6: this.minDamage=140;
					this.maxDamage=160;
					this.maxHp=490;
					this.hitChance=85;
					break;
			
			case 7: this.minDamage=160;
					this.maxDamage=180;
					this.maxHp=550;
					this.hitChance=85;
					break;
			
			case 8: this.minDamage=180;
					this.maxDamage=200;
					this.maxHp=630;
					this.hitChance=85;
					break;
			
			case 9: this.minDamage=200;
					this.maxDamage=220;
					this.maxHp=700;
					this.hitChance=85;
					break;
			}
			break;
			
		case "Orgyilkos":
			switch(this.level) {
			
			case 2: this.minDamage=60;
					this.maxDamage=70;
					this.maxHp=150;
					this.hitChance=80;
					break;
			
			case 3: this.minDamage=70;
					this.maxDamage=90;
					this.maxHp=200;
					this.hitChance=80;
					break;
			
			case 4: this.minDamage=100;
					this.maxDamage=130;
					this.maxHp=250;
					this.hitChance=85;
					break;
			
			case 5: this.minDamage=140;
					this.maxDamage=160;
					this.maxHp=300;
					this.hitChance=80;
					break;
			
			case 6: this.minDamage=170;
					this.maxDamage=190;
					this.maxHp=350;
					this.hitChance=80;
					break;
			
			case 7: this.minDamage=220;
					this.maxDamage=240;
					this.maxHp=400;
					this.hitChance=80;
					break;
			
			case 8: this.minDamage=240;
					this.maxDamage=260;
					this.maxHp=475;
					this.hitChance=85;
					break;
			
			case 9: this.minDamage=260;
					this.maxDamage=270;
					this.maxHp=550;
					this.hitChance=80;
					break;
			}
			break;	
		}	
	}
	
	@Override
	public void setLevel(int xp){
		if (this.xp>=760) level = 9;
		else if(this.xp>620) level=8;
		else if(this.xp>=500) level=7;
		else if(this.xp>=400) level=6;
		else if(this.xp>=310) level=5;
		else if(this.xp>=220) level=4;
		else if(this.xp>=130) level=3;
		else if(this.xp>=60) level=2;
		
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
		
		if(this.isAlive()) {
			this.setGold(this.getGold()+h1.getGold());
			this.setXp(this.getXp()+h1.getXp());
			this.setLevel(this.getXp());
			this.levelUP();
			this.regen();
			System.out.println("Gyõztél");
		}else {
			System.out.println("Vesztettél");
			System.out.println("Ennyit sikerült összeszedni: " +this.getXp());
		}
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

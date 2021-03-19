
public class  Harcos { //Fõosztály
	
	protected String cast;
	protected int level;
	protected int minDamage; 
	protected int maxDamage;
	protected int hp;
	protected int hitChance;
	protected int xp;
	protected int gold;
	
	
	//GETTER SETTER
	
	public int getLevel() { return level;}
	public void setLevel(int level) {this.level = level;}

	public int getMinDamage() {return minDamage;}
	public void setMinDamage(int minDamage) {this.minDamage = minDamage;}

	public int getMaxDamage() {return maxDamage;}
	public void setMaxDamage(int maxDamage) {this.maxDamage = maxDamage;}

	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public int getHitChance() {return hitChance;}
	public void setHitChance(int hitChance) {this.hitChance = hitChance;}
	
	public int getXp() {return xp;}
	public void setXp(int xp) {this.xp = xp;}
	
	public int getGold() {return gold;}
	public void setGold(int gold) {this.gold = gold;}
	
	
	//OTHER METHODS
	public int generateSebzes() {
		return (int)(Math.random() * (this.maxDamage - this.minDamage + 1) + this.minDamage);
	}
	
	public boolean isHit() {
		int szam = Methods.rdm(1,100);
		if(szam<=this.hitChance) 
			return  true;	
		else
			return false;		
	}
	
	public boolean isAlive() {
		if (this.hp>0)
			return true;
		else
			return false;
	}
	
	public void tamad(Harcos h1){
		if(this.isAlive() && this.isHit()) {
			h1.setHp(h1.getHp()-this.generateSebzes());
		}
	}
	
	//
	

	
	
	//toString
	public String toString() {
		return "Cast: " +this.cast + " Attack: " + this.minDamage + "-" + this.maxDamage + ", HP: "+this.hp +", Level: " + this.level;
	}
	
}


public abstract class  Harcos {
	
	protected int level;
	protected int minSebzes;
	protected int maxSebzes;
	protected int elet;
	protected int hitChance; 
	
	public int getMinSebzes() {
		return minSebzes;
	}

	public void setMinSebzes(int minSebzes) {
		this.minSebzes = minSebzes;
	}

	public int getMaxSebzes() {
		return maxSebzes;
	}

	public void setMaxSebzes(int maxSebzes) {
		this.maxSebzes = maxSebzes;
	}

	public int getElet() {
		return elet;
	}
	public void setElet(int elet) {
		this.elet = elet;
	}
	
	public int getHitChance() {
		return hitChance;
	}

	public void setHitChance(int hitChance) {
		this.hitChance = hitChance;
	}
	
	//Sebzes generalas maxbol & minbõl

	int generateSebzes() {
		return (int)(Math.random() * (this.maxSebzes - this.minSebzes + 1) + this.minSebzes);
	}
	
	//Hit generálás hitchancebõl
	
	boolean generatHit() {
		int min=1;
		int max=100;
		int szam = (int)(Math.random() * (max - min + 1) + min);
		if(szam<=hitChance) 
			return  true;	
		else
			return false;		
	}

	
	//tostring
	
	public String toString() {
		return "Level: "+ "Sebzes range: " + this.minSebzes + "-" + this.maxSebzes+ " aktual sebzes :"+ generateSebzes()+", elet: "+this.elet +
				"sikerült az ütés: " + generatHit();
	}
	
}

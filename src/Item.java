
public class Item {
	private String name;
	private int gold;
	private int plusDamage;
	private int plusHp;
	
	Item (String name, int gold, int plusDamage, int plusHp){
			this.name=name;
			this.gold=gold;
			this.plusDamage=plusDamage;
			this.plusHp=plusHp;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getGold() {return gold;}
	public void setGold(int gold) {this.gold = gold;}

	public int getPlusDamage() {return plusDamage;}
	public void setPlusDamage(int plusDamage) {this.plusDamage = plusDamage;}

	public int getPlusHp() {return plusHp;}
	public void setPlusHp(int plusHp) {this.plusHp = plusHp;}

	public String toString() {
		if (this.plusDamage>0)
			return this.name +" +" + this.plusDamage+" sebzes Ár: " + this.gold;
		else
			return this.name +" +" + this.plusHp+" HP Ár: "+ this.gold;
	}

}

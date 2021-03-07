
public class tank extends harcos{
	
	//konstruktor
	
	
	tank(){}
	tank(int level){
		
		switch (level){
		case 1:
			this.level=1;
			this.minSebzes=1;
			this.maxSebzes=2;
			this.elet=10;
			this.hitChance=8;
		    break;
		case 2:
			this.level=2;
			this.minSebzes=2;
			this.maxSebzes=3;
			this.elet=12;
			this.hitChance=8;
		    break;
		case 3:
			this.level=3;
			this.minSebzes=3;
			this.maxSebzes=5;
			this.elet=15;
			this.hitChance=8;
		    break;
		}
	}
	
}

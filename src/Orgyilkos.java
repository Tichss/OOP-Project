public class Orgyilkos extends Harcos{

    Orgyilkos(){}
    Orgyilkos(int level){
    	
    	this.cast="Orgyilkos";

        switch (level){
        case 1:
            this.level=1;
            this.minDamage=3;
            this.maxDamage=5;
            this.hp=6;
            this.hitChance=50;
            this.xp=30;
            this.gold=30;
            break;
        case 2:
            this.level=2;
            this.minDamage=4;
            this.maxDamage=5;
            this.hp=8;
            this.hitChance=50;
            this.xp=30;
            this.gold=30;
            break;
        case 3:
            this.level=3;
            this.minDamage=4;
            this.maxDamage=6;
            this.hp=10;
            this.hitChance=50;
            break;
        case 4:
            this.level=4;
            this.minDamage=5;
            this.maxDamage=6;
            this.hp=12;
            this.hitChance=50;
            break;
        case 5:
            this.level=5;
            this.minDamage=6;
            this.maxDamage=8;
            this.hp=15;
            this.hitChance=50;
            break;
        case 6:
            this.level=6;
            this.minDamage=7;
            this.maxDamage=8;
            this.hp=17;
            this.hitChance=50;
            break;
        case 7:
            this.level=7;
            this.minDamage=8;
            this.maxDamage=10;
            this.hp=20;
            this.hitChance=50;
            break;
        case 8:
            this.level=8;
            this.minDamage=8;
            this.maxDamage=10;
            this.hp=22;
            this.hitChance=45;
            break;
        case 9:
            this.level=9;
            this.minDamage=10;
            this.maxDamage=10;
            this.hp=25;
            this.hitChance=45;
            break;

        }
    }
}
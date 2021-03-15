
public class Tank extends Harcos{

    Tank(){}
    Tank(int level){
    	
    	this.cast="Tank";

        switch (level){
        case 1:
            this.level=1;
            this.minDamage=1;
            this.maxDamage=2;
            this.hp=10;
            this.hitChance=80;
            this.xp=30;
            this.gold=30;
            break;
        case 2:
            this.level=2;
            this.minDamage=2;
            this.maxDamage=3;
            this.hp=12;
            this.hitChance=80;
            this.xp=30;
            this.gold=30;
            break;
        case 3:
            this.level=3;
            this.minDamage=2;
            this.maxDamage=3;
            this.hp=16;
            this.hitChance=80;
            break;
        case 4:
            this.level=4;
            this.minDamage=3;
            this.maxDamage=4;
            this.hp=18;
            this.hitChance=80;
            break;
        case 5:
            this.level=5;
            this.minDamage=3;
            this.maxDamage=4;
            this.hp=22;
            this.hitChance=75;
            break;
        case 6:
            this.level=6;
            this.minDamage=4;
            this.maxDamage=5;
            this.hp=24;
            this.hitChance=75;
            break;
        case 7:
            this.level=7;
            this.minDamage=4;
            this.maxDamage=5;
            this.hp=28;
            this.hitChance=70;
            break;
        case 8:
            this.level=8;
            this.minDamage=5;
            this.maxDamage=6;
            this.hp=30;
            this.hitChance=65;
            break;
        case 9:
            this.level=9;
            this.minDamage=6;
            this.maxDamage=6;
            this.hp=35;
            this.hitChance=65;
            break;
        }
    }

}

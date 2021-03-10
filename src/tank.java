
public class Tank extends Harcos{

    Tank(){}
    Tank(int level){

        switch (level){
        case 1:
            this.level=1;
            this.minSebzes=1;
            this.maxSebzes=2;
            this.elet=10;
            this.hitChance=80;
            break;
        case 2:
            this.level=2;
            this.minSebzes=2;
            this.maxSebzes=3;
            this.elet=12;
            this.hitChance=80;
            break;
        case 3:
            this.level=3;
            this.minSebzes=2;
            this.maxSebzes=3;
            this.elet=16;
            this.hitChance=80;
            break;
        case 4:
            this.level=4;
            this.minSebzes=3;
            this.maxSebzes=4;
            this.elet=18;
            this.hitChance=80;
            break;
        case 5:
            this.level=5;
            this.minSebzes=3;
            this.maxSebzes=4;
            this.elet=22;
            this.hitChance=75;
            break;
        case 6:
            this.level=6;
            this.minSebzes=4;
            this.maxSebzes=5;
            this.elet=24;
            this.hitChance=75;
            break;
        case 7:
            this.level=7;
            this.minSebzes=4;
            this.maxSebzes=5;
            this.elet=28;
            this.hitChance=70;
            break;
        case 8:
            this.level=8;
            this.minSebzes=5;
            this.maxSebzes=6;
            this.elet=30;
            this.hitChance=65;
            break;
        case 9:
            this.level=9;
            this.minSebzes=6;
            this.maxSebzes=6;
            this.elet=35;
            this.hitChance=65;
            break;
        }
    }

}

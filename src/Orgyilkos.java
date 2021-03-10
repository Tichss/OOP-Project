public class Orgyilkos extends Harcos{

    Orgyilkos(){}
    Orgyilkos(int level){

        switch (level){
        case 1:
            this.level=1;
            this.minSebzes=3;
            this.maxSebzes=5;
            this.elet=6;
            this.hitChance=50;
            break;
        case 2:
            this.level=2;
            this.minSebzes=4;
            this.maxSebzes=5;
            this.elet=8;
            this.hitChance=50;
            break;
        case 3:
            this.level=3;
            this.minSebzes=4;
            this.maxSebzes=6;
            this.elet=10;
            this.hitChance=50;
            break;
        case 4:
            this.level=4;
            this.minSebzes=5;
            this.maxSebzes=6;
            this.elet=12;
            this.hitChance=50;
            break;
        case 5:
            this.level=5;
            this.minSebzes=6;
            this.maxSebzes=8;
            this.elet=15;
            this.hitChance=50;
            break;
        case 6:
            this.level=6;
            this.minSebzes=7;
            this.maxSebzes=8;
            this.elet=17;
            this.hitChance=50;
            break;
        case 7:
            this.level=7;
            this.minSebzes=8;
            this.maxSebzes=10;
            this.elet=20;
            this.hitChance=50;
            break;
        case 8:
            this.level=8;
            this.minSebzes=8;
            this.maxSebzes=10;
            this.elet=22;
            this.hitChance=45;
            break;
        case 9:
            this.level=9;
            this.minSebzes=10;
            this.maxSebzes=10;
            this.elet=25;
            this.hitChance=45;
            break;

        }
    }
}
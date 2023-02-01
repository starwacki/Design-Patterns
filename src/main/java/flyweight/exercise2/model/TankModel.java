package flyweight.exercise2.model;

public enum TankModel {

    BASIC(1000,300,350,100),
    MEDIUM_WEIGHT(1200,350,250,80),
    HEAVY(1400,400,350,60),
    BATTLE(1000,350,500,100);

    private int hp;
    private int defence;
    private int dmg;
    private int speed;

    TankModel(int hp, int defence, int dmg, int speed) {
        this.hp = hp;
        this.defence = defence;
        this.dmg = dmg;
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getDmg() {
        return dmg;
    }

    public int getSpeed() {
        return speed;
    }
}

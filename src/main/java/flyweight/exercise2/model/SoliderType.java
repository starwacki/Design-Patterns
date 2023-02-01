package flyweight.exercise2.model;

public enum SoliderType {

    BASIC(100,100,100,100),
    SNIPER(120,100,200,110),
    COMMANDO(150,150,120,100);

    private int hp;
    private int defence;
    private int dmg;
    private int speed;

    SoliderType(int hp, int defence, int dmg, int speed) {
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

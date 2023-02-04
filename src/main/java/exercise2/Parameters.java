package exercise2;

public class Parameters {

private int hp;
private int dmg;
private int defence;
private int speed;

    public Parameters(int hp, int dmg, int defence, int speed) {
        this.hp = hp;
        this.dmg = dmg;
        this.defence = defence;
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public int getDefence() {
        return defence;
    }

    public int getSpeed() {
        return speed;
    }
}

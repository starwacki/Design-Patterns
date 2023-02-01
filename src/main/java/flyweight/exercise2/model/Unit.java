package flyweight.exercise2.model;

public abstract class Unit {

    private int hp;
    private int defence;
    private int dmg;
    private int speed;

    public Unit(int hp, int defence, int dmg, int speed) {
        this.hp = hp;
        this.defence = defence;
        this.dmg = dmg;
        this.speed = speed;
    }

    abstract void attack(Unit unit);

    @Override
    public String toString() {
        return "Unit{" +
                "hp=" + hp +
                ", defence=" + defence +
                ", dmg=" + dmg +
                ", speed=" + speed +
                '}';
    }
}

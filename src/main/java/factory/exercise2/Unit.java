package factory.exercise2;

public abstract class Unit {

    private int hp;
    private int speed;
    private int damage;

    public Unit(int hp, int speed, int damage) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "hp=" + hp +
                ", speed=" + speed +
                ", damage=" + damage +
                '}';
    }
}

package factory.exercise2.unit;

import factory.exercise2.Unit;

public class Helicopter extends Unit {

    private HelicopterType helicopterType;

    protected Helicopter(int hp, int speed, int damage, HelicopterType helicopterType) {
        super(hp, speed, damage);
        this.helicopterType = helicopterType;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "helicopterType=" + helicopterType +
                '}';
    }
}

package factory.exercise2.unit;

import factory.exercise2.Unit;

public class Tank extends Unit {

    private TankType tankType;
    protected Tank(int hp, int speed, int damage,TankType tankType) {
        super(hp, speed, damage);
        this.tankType = tankType;
    }
}

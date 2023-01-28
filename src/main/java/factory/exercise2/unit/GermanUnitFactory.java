package factory.exercise2.unit;

import factory.exercise2.UnitFactory;
import factory.exercise2.unit.*;

public class GermanUnitFactory implements UnitFactory {
    private static  final HelicopterType GERMAN_HELICOPTER = HelicopterType.BK_177;
    private static final TankType GERMAN_TANK = TankType.PzKpfw_II;
    private static GermanUnitFactory instance;

    private GermanUnitFactory() {
    }

    public static GermanUnitFactory getInstance() {
        if (instance==null) {
            instance = new GermanUnitFactory();
        }
        return instance;
    }

    @Override
    public Helicopter createHelicopter() {
        return new Helicopter(5000,100,20, GERMAN_HELICOPTER);
    }

    @Override
    public Tank createTank() {
        return new Tank(1000,10,40, GERMAN_TANK);
    }

    @Override
    public Solider createSolider() {
        return new Solider(50,5,10);
    }
}

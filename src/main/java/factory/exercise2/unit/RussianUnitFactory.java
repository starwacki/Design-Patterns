package factory.exercise2.unit;

import factory.exercise2.UnitFactory;
import factory.exercise2.unit.*;

public class RussianUnitFactory implements UnitFactory {

    private static  final HelicopterType RUSSIAN_HELICOPTER = HelicopterType.Mi_2;
    private static final TankType RUSSIAN_TANK = TankType.T_34;

    private static RussianUnitFactory instance;

    private RussianUnitFactory() {
    }

    public static RussianUnitFactory getInstance() {
        if (instance==null) {
            instance = new RussianUnitFactory();
        }
        return instance;
    }

    @Override
    public Helicopter createHelicopter() {
        return new Helicopter(5000,100,20, RUSSIAN_HELICOPTER);
    }

    @Override
    public Tank createTank() {
        return new Tank(1000,10,40, RUSSIAN_TANK);
    }

    @Override
    public Solider createSolider() {
        return new Solider(50,5,10);
    }
}

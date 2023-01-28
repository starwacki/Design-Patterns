package factory.exercise2.unit;

import factory.exercise2.UnitFactory;

public class PolandUnitFactory implements UnitFactory {

    private static  final HelicopterType POLISH_HELICOPTER = HelicopterType.SW_4_PUSZCZYK;
    private static final TankType POLISH_TANK = TankType.TK_3;

    private static PolandUnitFactory instance;

    private PolandUnitFactory() {
    }

    public static PolandUnitFactory getInstance() {
        if (instance==null) {
            instance = new PolandUnitFactory();
        }
        return instance;
    }

    @Override
    public Helicopter createHelicopter() {
        return new Helicopter(5000,100,20,POLISH_HELICOPTER);
    }

    @Override
    public Tank createTank() {
        return new Tank(1000,10,40,POLISH_TANK);
    }

    @Override
    public Solider createSolider() {
        return new Solider(50,5,10);
    }
}

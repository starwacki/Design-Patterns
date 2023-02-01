package flyweight.exercise2;

import flyweight.exercise2.model.Unit;

public interface TankAbstractFactory {

    Unit createBasicTank();

    Unit createMediumWeightTank();

    Unit createHeavyTank();

    Unit createBattleTank();


}

package exercise2;

import exercise2.model.Unit;

public interface TankAbstractFactory {

    Unit createBasicTank();

    Unit createMediumWeightTank();

    Unit createHeavyTank();

    Unit createBattleTank();


}

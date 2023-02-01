package exercise2.model;

import exercise2.TankAbstractFactory;
import exercise2.model.Tank;
import exercise2.model.TankModel;
import exercise2.model.Unit;

public class TankFactory implements TankAbstractFactory {

    @Override
    public Unit createBasicTank() {
        return new Tank(TankModel.BASIC);
    }

    @Override
    public Unit createMediumWeightTank() {
        return new Tank(TankModel.MEDIUM_WEIGHT);
    }

    @Override
    public Unit createHeavyTank() {
        return new Tank(TankModel.HEAVY);
    }

    @Override
    public Unit createBattleTank() {
        return new Tank(TankModel.BATTLE);
    }
}

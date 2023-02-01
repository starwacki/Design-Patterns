package flyweight.exercise2.model;

import flyweight.exercise2.TankAbstractFactory;

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

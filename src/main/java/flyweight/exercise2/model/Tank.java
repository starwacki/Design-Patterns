package flyweight.exercise2.model;

public class Tank extends Unit {

    private TankModel tankModel;

     Tank(TankModel tankModel) {
        super(tankModel.getHp(),tankModel.getDefence(),tankModel.getDmg(),tankModel.getSpeed());
        this.tankModel = tankModel;
    }

    @Override
    void attack(Unit unit) {

    }

    public TankModel getTankModel() {
        return tankModel;
    }
}

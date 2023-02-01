package exercise2.model;

public class Solider extends Unit {

    private SoliderType soliderType;


    Solider(SoliderType soliderType) {
        super(soliderType.getHp(), soliderType.getDefence(), soliderType.getDmg(), soliderType.getSpeed());
        this.soliderType = soliderType;
    }

    @Override
    void attack(Unit unit) {

    }

    @Override
    public String toString() {
        return super.toString() + " soliderType:" +
        soliderType.hashCode();
    }

}

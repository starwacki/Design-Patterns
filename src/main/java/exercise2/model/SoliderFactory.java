package exercise2.model;

import exercise2.SoliderAbstractFactory;
import exercise2.model.Solider;
import exercise2.model.SoliderType;
import exercise2.model.Unit;

public class SoliderFactory implements SoliderAbstractFactory {

    @Override
    public Unit createBasicSolider() {
        return new Solider(SoliderType.BASIC);
    }

    @Override
    public Unit createSniper() {
        return new Solider(SoliderType.SNIPER);
    }

    @Override
    public Unit createCommando() {
        return new Solider(SoliderType.COMMANDO);
    }
}

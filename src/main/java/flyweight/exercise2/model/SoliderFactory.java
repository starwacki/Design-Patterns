package flyweight.exercise2.model;

import flyweight.exercise2.SoliderAbstractFactory;

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

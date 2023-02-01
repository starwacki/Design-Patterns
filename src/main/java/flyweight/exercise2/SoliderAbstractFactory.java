package flyweight.exercise2;

import flyweight.exercise2.model.Unit;

public interface SoliderAbstractFactory {

    Unit createBasicSolider();

    Unit createSniper();

    Unit createCommando();
}

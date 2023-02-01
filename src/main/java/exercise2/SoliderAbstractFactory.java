package exercise2;

import exercise2.model.Unit;

public interface SoliderAbstractFactory {

    Unit createBasicSolider();

    Unit createSniper();

    Unit createCommando();
}

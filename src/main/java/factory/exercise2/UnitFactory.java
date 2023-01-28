package factory.exercise2;

import factory.exercise2.unit.Helicopter;
import factory.exercise2.unit.Solider;
import factory.exercise2.unit.Tank;

public interface UnitFactory {

    Helicopter createHelicopter();

    Tank createTank();

    Solider createSolider();
}

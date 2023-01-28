package factory.exercise2;

import factory.Factory;
import factory.exercise2.unit.GermanUnitFactory;
import factory.exercise2.unit.PolandUnitFactory;
import factory.exercise2.unit.RussianUnitFactory;
import factory.exercise2.unit.Tank;

public class AppExercise2 {
    public static void main(String[] args) {
        GermanUnitFactory germanUnitFactory = GermanUnitFactory.getInstance();
        PolandUnitFactory polandUnitFactory = PolandUnitFactory.getInstance();
        RussianUnitFactory russianUnitFactory = RussianUnitFactory.getInstance();

        Unit unit  = germanUnitFactory.createHelicopter();
        Unit unit1 = polandUnitFactory.createHelicopter();
        Unit unit2 = russianUnitFactory.createHelicopter();

        System.out.println(unit1);
        System.out.println(unit2);
        System.out.println(unit);
    }
}

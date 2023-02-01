package exercise2;

import exercise2.model.Solider;
import exercise2.model.SoliderFactory;
import exercise2.model.Unit;

public class App {
    public static void main(String[] args) {

        SoliderFactory soliderFactory = new SoliderFactory();
        Unit unit1 = soliderFactory.createBasicSolider();
        Unit unit2 = soliderFactory.createBasicSolider();
        System.out.println(unit1.toString());
        System.out.println(unit2.toString());




    }
}

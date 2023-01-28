package dekorator;

public class RiceMeal extends Meal{


    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuje posiłek na bazie ryżu. ");
    }
}

package dekorator;

public class PotatoMeal extends Meal{

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuje posiłek na bazie ziemniaków");
    }

}

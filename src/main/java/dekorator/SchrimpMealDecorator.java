package dekorator;

public class SchrimpMealDecorator extends MealDecorator {


    public SchrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSchrimp();
    }

    private void addSchrimp() {
        System.out.println("Do dania dodaję schrimp.");
    }
}

package strategy;

public class AppStrategy {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator(new RegularPrice());
        PriceCalculator priceCalculator1 = new PriceCalculator(new SalesPrice());

        priceCalculator.calculate(200,false);
        System.out.println();
        priceCalculator.calculate(200,true);
        System.out.println("--------------------");
        priceCalculator1.calculate(200,false);
        System.out.println();
        priceCalculator1.calculate(200,true);
    }
}

package strategy;

public class PriceCalculator {

    private PricingStrategy pricingStrategy;

    public PriceCalculator(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void calculate(int price, boolean isSignedUpNewsletter) {
        pricingStrategy.calculatePrice(price,isSignedUpNewsletter);
    }
}

package strategy;

public class SalesPrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter)
            System.out.println(price/2.0);
        else
            System.out.println("Niepoprawny strategia - użytkownik nie jest zapisany do newslettera");
    }
}

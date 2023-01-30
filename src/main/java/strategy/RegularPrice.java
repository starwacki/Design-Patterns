package strategy;

public class RegularPrice implements PricingStrategy{

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (!isSignedUpForNewsletter)
            System.out.println(price);
        else
            System.out.println("Niepoprawna strategia: użytkownik jest zapisany do newslettera");
    }
}

package dekorator.exercise2;

import java.util.ArrayList;
import java.util.List;

public abstract class BMW {

    private int price;

    private String description;

    private List<String> accessories;

    public BMW(int price, String description) {
        this.price = price;
        this.description = description;
        this.accessories = new ArrayList<>();
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void addAccessories(String accessories) {
        this.accessories.add(accessories);
    }

    public List<String> getAccessories() {
        return accessories;
    }
}

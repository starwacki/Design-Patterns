package dekorator.exercise2;

public enum ModelInfo {
    E36(50000,"BMW E36 silnik 1.5-2.0, rok produkcji 2023"),
    E46(70000,"BMW E36 silnik 2.0-2.5, rok produkcji 2023"),
    E92(90000,"BMW E36 silnik 3.0-3.5, rok produkcji 2023");

    private int price;
    private String description;

    ModelInfo(int price, String description) {
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

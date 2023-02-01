package dekorator.exercise2;

public class E46 extends BMW{

    public E46() {
        super(ModelInfo.E46.getPrice(), ModelInfo.E46.getDescription());
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}

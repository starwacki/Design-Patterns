package dekorator.exercise2;

public class E36 extends BMW{

    public E36() {
        super(ModelInfo.E36.getPrice(), ModelInfo.E36.getDescription());
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

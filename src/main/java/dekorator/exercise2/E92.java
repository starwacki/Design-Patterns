package dekorator.exercise2;

public class E92 extends BMW{

    public E92() {
        super(ModelInfo.E92.getPrice(), ModelInfo.E92.getDescription());
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

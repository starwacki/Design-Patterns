package dekorator.exercise2;

public class MPackageDecorator extends CarAccessories{

    private static final int PRICE = 20000;

    private BMW bmw;


    public MPackageDecorator(BMW bmw) {
        super(bmw.getPrice()+PRICE, bmw.getDescription());
        this.getAccessories().addAll(bmw.getAccessories());
        this.addAccessories("M-package");
    }
}

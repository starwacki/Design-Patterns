package dekorator.exercise2;

public class OnBoardComputerDecorator extends CarAccessories{

    private static final  int PRICE = 1000;

    public OnBoardComputerDecorator(BMW bmw) {
        super(bmw.getPrice()+PRICE, bmw.getDescription());
        this.getAccessories().addAll(bmw.getAccessories());
        this.addAccessories("On-board computer");
    }
}

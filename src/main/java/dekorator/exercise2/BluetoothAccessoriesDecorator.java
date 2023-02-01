package dekorator.exercise2;

public  class BluetoothAccessoriesDecorator extends CarAccessories {


    private static final int PRICE = 10000;

    public BluetoothAccessoriesDecorator(BMW bmw) {
        super(bmw.getPrice()+PRICE, bmw.getDescription());
        this.getAccessories().addAll(bmw.getAccessories());
        this.addAccessories("Bluetooth");
    }
}

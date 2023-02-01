package dekorator.exercise2;

public class App {
    public static void main(String[] args) {
        BMW bmw = new MPackageDecorator(new OnBoardComputerDecorator(new OnBoardComputerDecorator(new E36())));
        BMW bmw1 = new E36();
        System.out.println(bmw.getPrice());
        System.out.println(bmw.getAccessories());
        System.out.println();
        System.out.println(bmw1.getPrice());

    }
}

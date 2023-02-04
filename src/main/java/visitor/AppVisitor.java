package visitor;

import java.util.Arrays;
import java.util.List;

public class AppVisitor {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 30);
        Person person = new Person("Dawid","Nowak",true);
        Shipment shipment = new Shipment("EN","434312SADAS",false);
        List<Transportable> transportableList = Arrays.asList(animal,person,shipment);
        transportableList.forEach(transportable -> transportable.accept(new NameTransportVisitor()));
        System.out.println();
        transportableList.forEach(transportable -> transportable.accept(new PriceTransportVisitor()));

    }
}

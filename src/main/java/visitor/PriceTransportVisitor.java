package visitor;

public class PriceTransportVisitor implements TransportVisitor{
    @Override
    public void visit(Animal animal) {
        System.out.println("Cena  za km " +  0.2*animal.getWeight());
    }

    @Override
    public void visit(Person person) {
        if (person.isRegularCustomer())
            System.out.println("Cena  za km " +  2);
        else
            System.out.println("Cena  za km " +  6);
    }

    @Override
    public void visit(Shipment shipment) {
        if (shipment.isLarge())
            System.out.println("Cena  za km " +  3);
        else
            System.out.println("Cena  za km " +  2);

    }
}

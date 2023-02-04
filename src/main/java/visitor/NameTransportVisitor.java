package visitor;

public class NameTransportVisitor implements TransportVisitor{
    @Override
    public void visit(Animal animal) {
        System.out.println("Desygnacja : zwierze " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Desygnacja : człowiek " + person.getFirstname() + " " + person.getLastname());

    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Desygnacja : shipment" + shipment.getPrefix() + " serial number: " + shipment.getSerialNumber());
    }
}

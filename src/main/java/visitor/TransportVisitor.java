package visitor;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person animal);
    void visit(Shipment animal);
}

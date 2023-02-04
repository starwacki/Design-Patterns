package visitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);
}

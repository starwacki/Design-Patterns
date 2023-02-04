package visitor;

public class Person implements Transportable {

    private String firstname;
    private String lastname;
    private boolean isRegularCustomer;

    public Person(String firstname, String lastname, boolean isRegularCustomer) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.isRegularCustomer = isRegularCustomer;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isRegularCustomer() {
        return isRegularCustomer;
    }

    public void setRegularCustomer(boolean regularCustomer) {
        isRegularCustomer = regularCustomer;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }
}

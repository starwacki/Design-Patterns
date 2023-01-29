package observer.exercise2;

public class Email implements Observe {

    private String to;

    public Email(String to) {
        this.to = to;
    }


    @Override
    public void sendMessages() {
        System.out.println("Email is sending to: " + to);
    }
}

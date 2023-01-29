package observer.exercise2;

public class SMS implements Observe{
    private String phoneNumber;

    public SMS(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessages() {
        System.out.println("Sms  is sending to: " + phoneNumber);
    }
}

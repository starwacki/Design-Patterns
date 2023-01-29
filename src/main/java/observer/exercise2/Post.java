package observer.exercise2;

public class Post implements Observe {

    private String adress;

    public Post(String adress) {
        this.adress = adress;
    }

    @Override
    public void sendMessages() {
        sendPostMessage();
    }

    public void sendPostMessage() {
        System.out.println("Post message is sending to: " + adress);
    }
}

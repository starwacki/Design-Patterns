package chains_of_responsibility;

public interface Handler {

    void handle(MotherRequest motherRequest);

    void setNext(Handler handler);
}

package chains_of_responsibility.exercise2;

public interface Handler {

    void execute(Task task);

    void setNext(Handler handler);
}

package chains_of_responsibility.exercise2;

public class MidDeveloper implements Handler{

    private Handler nextHandler;

    @Override
    public void execute(Task task) {
        if (task.getTaskLevel()==TaskLevel.MEDIUM)
            System.out.println("Mid dev robi taska: " + task.getDescription());
        else
            nextHandler.execute(task);
    }

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

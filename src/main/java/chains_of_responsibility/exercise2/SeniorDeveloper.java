package chains_of_responsibility.exercise2;

public class SeniorDeveloper implements Handler{

    @Override
    public void execute(Task task) {
        if (task.getTaskLevel()==TaskLevel.HARD)
            System.out.println("Senior dev robi taska " + task.getDescription());
        else
            throw new IllegalArgumentException("Task nie do zrobiienia!");
    }

    @Override
    public void setNext(Handler nextHandler) {
    }
}

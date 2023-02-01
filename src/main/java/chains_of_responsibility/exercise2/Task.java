package chains_of_responsibility.exercise2;

public class Task {

    private String description;
    private TaskLevel taskLevel;

    public Task(String description, TaskLevel taskLevel) {
        this.description = description;
        this.taskLevel = taskLevel;
    }

    public String getDescription() {
        return description;
    }

    public TaskLevel getTaskLevel() {
        return taskLevel;
    }
}

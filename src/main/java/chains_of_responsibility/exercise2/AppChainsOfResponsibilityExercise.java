package chains_of_responsibility.exercise2;

public class AppChainsOfResponsibilityExercise {
    public static void main(String[] args) {
        Task task1 = new Task("Napisanie własnego systemu kontroli wersji",TaskLevel.HARD);
        Task task2 = new Task("Pokolorowanie buttona",TaskLevel.EASY);
        Task task3 = new Task("Integracja systemow",TaskLevel.MEDIUM);

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MidDeveloper midDeveloper  = new MidDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        juniorDeveloper.setNext(midDeveloper);
        midDeveloper.setNext(seniorDeveloper);

        juniorDeveloper.execute(task1);
        System.out.println("---------");
        juniorDeveloper.execute(task2);
        System.out.println("---------");
        juniorDeveloper.execute(task3);
        System.out.println("---------");
    }
}

package template_method;

public class FreeManDay extends DayOfWorkingPerson {
    @Override
    public void work() {
        System.out.println("Praca jako księgowy");
    }

    @Override
    public void spendFreeTime() {
        System.out.println("Trening na siłowni");
        System.out.println("Czytanie artykułów naukowych");
    }
}

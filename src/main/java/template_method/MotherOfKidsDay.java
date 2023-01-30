package template_method;

public class MotherOfKidsDay extends DayOfWorkingPerson{
    @Override
    public void work() {
        System.out.println("Praca jako nauczyciel");
    }

    @Override
    public void spendFreeTime() {
        System.out.println("Opieka na dziećmi");
        System.out.println("Czytanie książki");
    }
}

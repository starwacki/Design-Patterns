package template_method;

public abstract class DayOfWorkingPerson {

    public  final void day(String time,TypeOfTransport type) {
        wakeUp(time);
        goToTheWork(type);
        work();
        spendFreeTime();
        goSleep();

    }

    public  void wakeUp(String time) {
        System.out.println("Pobudka o: " + time);
    }

    public void goToTheWork(TypeOfTransport type) {
        System.out.println("Podróż do pracy: " + type);
    }

    public abstract void work();

    public abstract void spendFreeTime();

    public void goSleep() {
        System.out.println("Pójście spać");
    }
}

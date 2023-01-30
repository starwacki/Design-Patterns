package template_method;

public class AppTemplateMethod {
    public static void main(String[] args) {

        DayOfWorkingPerson freeManDay = new FreeManDay();
        MotherOfKidsDay motherOfKidsDay = new MotherOfKidsDay();

        freeManDay.day("6:00",TypeOfTransport.WALK);
        System.out.println();
        motherOfKidsDay.day("8:00",TypeOfTransport.CAR);
    }
}

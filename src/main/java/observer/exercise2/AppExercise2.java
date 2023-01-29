package observer.exercise2;

import java.time.LocalDate;

public class AppExercise2 {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter("message", LocalDate.of(2020,10,10));
        Email email = new Email("jasiek@wp.pl");
        Post post  = new Post("Warszawa ul. Janusza K 1");
        SMS sms = new SMS("111 111 111");
        newsletter.addObservers(email,post,sms);
        newsletter.actualNewsletter();
    }
}

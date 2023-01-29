package observer.exercise2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Newsletter implements Observable  {

    private String message;
    private LocalDate localDate;
    Set<Observe> observeSet;

    public Newsletter(String message, LocalDate localDate) {
        this.message = message;
        this.localDate = localDate;
        observeSet = new HashSet<>();
    }


    @Override
    public void addObservers(Observe... observers) {
        observeSet.addAll(Arrays.asList(observers));
    }

    @Override
    public void deleteObserve(Observe observe) {
        observeSet.remove(observe);

    }

    @Override
    public void notifyObserves() {
        for(Observe observe : observeSet) {
            observe.sendMessages();
        }
    }

    public void actualNewsletter() {
        System.out.println("Actualize newsletter");
        notifyObserves();
    }
}

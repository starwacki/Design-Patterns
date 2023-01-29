package observer.exercise2;

public interface Observable {

    void addObservers(Observe ... observe);

    void deleteObserve(Observe observe);

    void notifyObserves();
}

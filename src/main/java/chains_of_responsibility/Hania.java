package chains_of_responsibility;

public class Hania implements Handler{

    private Handler tallerChild;

    @Override
    public void handle(MotherRequest motherRequest) {
        if (motherRequest.getShelf()==Shelf.LOW)
            System.out.println("Hania bierze rzecz z półki");
        else
            tallerChild.handle(motherRequest);
    }

    @Override
    public void setNext(Handler handler) {
        tallerChild = handler;
    }
}

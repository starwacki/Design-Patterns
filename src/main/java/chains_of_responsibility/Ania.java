package chains_of_responsibility;

public class Ania implements Handler{

    private Handler tallerChild;

    @Override
    public void handle(MotherRequest motherRequest) {
        if (motherRequest.getShelf()==Shelf.MEDIUM)
            System.out.println("Ania bierze rzecz z półki " + motherRequest.getShelf());
        else
            tallerChild.handle(motherRequest);
    }

    @Override
    public void setNext(Handler handler) {
        tallerChild = handler;
    }

}

package chains_of_responsibility;

public class MotherRequest {

    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }
}

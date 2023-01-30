package chains_of_responsibility;

public class AppChainsOfResponsibility {
    public static void main(String[] args) {
        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
        Ania ania = new Ania();
        Tomek tomek = new Tomek();
        Hania hania = new Hania();

        hania.setNext(ania);
        ania.setNext(tomek);

        hania.handle(motherRequest);
    }
}

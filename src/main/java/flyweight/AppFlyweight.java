package flyweight;

import flyweight.cheesepiece.CheesePiece;

public class AppFlyweight {
    public static void main(String[] args) {
        CheesePiece cheesePiece1  = new CheesePiece("Pion",1,'A',ColorEnum.BLACK);
        CheesePiece cheesePiece2  = new CheesePiece("Pion",1,'B',ColorEnum.WHITE);
        CheesePiece cheesePiece3 = new CheesePiece("Król",1,'C',ColorEnum.BLACK);
        CheesePiece cheesePiece4 = new CheesePiece("Dama",1,'C',ColorEnum.BLACK);

        System.out.println(cheesePiece1.getColor()==cheesePiece2.getColor());
        System.out.println(cheesePiece1.getColor()==cheesePiece3.getColor());
        System.out.println(cheesePiece3.getColor()== cheesePiece4.getColor());

        /* Output will be:
        false
        true
        true,
        because cheesePiece1,cheesePiece3,cheesePiece4 have the same reference of Object Color
         */
    }
}

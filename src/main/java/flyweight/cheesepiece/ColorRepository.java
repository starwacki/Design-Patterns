package flyweight.cheesepiece;

import flyweight.cheesepiece.Color;

public class ColorRepository {

    private static final Color white = new Color(0,0,0);
    private static final Color black = new Color(256,256,256);

    protected static Color getWhite() {
        return white;
    }

    protected static Color getBlack() {
        return black;
    }

}

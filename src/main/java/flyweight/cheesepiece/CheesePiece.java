package flyweight.cheesepiece;

import flyweight.ColorEnum;

public class CheesePiece {

    private String name;
    private int numberPosition;
    private char letterPosition;
    private Color color;

    public CheesePiece(String name, int numberPosition, char letterPosition, ColorEnum colorEnum) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (colorEnum) {
            case BLACK -> this.color = ColorRepository.getBlack();
            case WHITE -> this.color = ColorRepository.getWhite();
        }
    }

    public String getName() {
        return name;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public char getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "CheesePiece{" +
                "name='" + name + '\'' +
                ", numberPosition=" + numberPosition +
                ", letterPosition=" + letterPosition +
                ", color=" + color +
                '}';
    }
}

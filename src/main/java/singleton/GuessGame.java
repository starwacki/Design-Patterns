package singleton;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private  int scores;

    private static GuessGame instance;

    private GuessGame () {
        scores = 0;
    }



    public static GuessGame getInstance() {
        if (instance==null)  {
            instance = new GuessGame();
        }
        return instance;
    }

    public  void play() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbe do odgadnięcia: ");
            int numberToGuess = getRandomNumber();
            int numberFromUser = getNumberFromUser();

            if (numberToGuess==numberFromUser) {
                scores++;
                System.out.println("Udało ci się zgadnąć liczbę, gratulacje!");
            }
            else {
                System.out.println("Niestety nie udało ci się odgadnąć liczby: " + numberToGuess);
            }
        }
        System.out.println("\n" + "Gra została zakończona, twój wynik to:" + scores);
    }

    private int getRandomNumber() {
        return new Random().nextInt(0,10);
    }

    private int getNumberFromUser() {
        return new Scanner(System.in).nextInt();
    }
}

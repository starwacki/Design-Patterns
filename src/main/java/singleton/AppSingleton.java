package singleton;

public class AppSingleton {
    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();
        game.play();
    }
}

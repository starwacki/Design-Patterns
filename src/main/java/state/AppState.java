package state;

public class AppState {
    public static void main(String[] args) {
        OneArmedBandit oneArmedBandit = new OneArmedBandit();
        oneArmedBandit.putCoin();
        oneArmedBandit.pullLever();
        oneArmedBandit.soutState();
        oneArmedBandit.takePrize();
    }
}

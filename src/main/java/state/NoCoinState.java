package state;

public class NoCoinState implements State {

    @Override
    public void putCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Moneta została włożona");
        oneArmedBandit.setState(new CoinInserted());
    }

    @Override
    public void pullLever(OneArmedBandit oneArmedBandit) {
        System.out.println("Włóż monete!");
    }

    @Override
    public void takePrize(OneArmedBandit oneArmedBandit) {
        System.out.println("Włóż monete!");
    }

}



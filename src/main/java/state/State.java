package state;

public interface State {

    void putCoin(OneArmedBandit oneArmedBandit);
    void pullLever(OneArmedBandit oneArmedBandit);
    void takePrize(OneArmedBandit oneArmedBandit);

}

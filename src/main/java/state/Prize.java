package state;

public class Prize implements State{

    private boolean win;

    public Prize(boolean win) {
        this.win = win;
    }

    @Override
    public void putCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Najpierw odbierz wygraną!");
    }

    @Override
    public void pullLever(OneArmedBandit oneArmedBandit) {
        System.out.println("Najpierw odbierz wygraną!");
    }

    @Override
    public void takePrize(OneArmedBandit oneArmedBandit) {
        if (win)
            System.out.println("Gratulacje, wygrałeś!");
        else
            System.out.println("Niestety, przegrałeś!");
        oneArmedBandit.setState(new NoCoinState());
    }

}

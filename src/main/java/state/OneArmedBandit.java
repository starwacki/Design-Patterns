package state;

public class OneArmedBandit {

    private State state;

    OneArmedBandit() {
        this.state = new NoCoinState();
    }

    public void putCoin() {
        state.putCoin(this);
    }

    public void pullLever() {
        state.pullLever(this);
    }

    public void takePrize() {
        state.takePrize(this);
    }

    public void soutState() {
        System.out.println("Aktualny stan: " + state);
    }



    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

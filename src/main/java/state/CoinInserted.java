package state;

import java.util.Random;

public class CoinInserted implements State {

    @Override
    public void putCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Moneta jest już włożona!");
    }

    @Override
    public void pullLever(OneArmedBandit oneArmedBandit) {
        System.out.println("Dźwignia została pociągnięta!");
        Random random = new Random();
        int randomNumber = random.nextInt(0,5);
        if (randomNumber==0)
            oneArmedBandit.setState(new Prize(true));
        else
            oneArmedBandit.setState(new Prize(false));
    }

    @Override
    public void takePrize(OneArmedBandit oneArmedBandit) {
        System.out.println("Najpierw pociagnij dźwignie!");
    }


}

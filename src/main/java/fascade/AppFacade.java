package fascade;

import fascade.model.AtmMachineFacade;

public class AppFacade {
    public static void main(String[] args) {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();

        atmMachineFacade.withdrawMoney();

    }
}

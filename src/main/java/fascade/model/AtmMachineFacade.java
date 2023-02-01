package fascade.model;

import fascade.model.BankSystem;
import fascade.model.AtmMachine;

public class AtmMachineFacade {

    private AtmMachine atmMachine;
    private BankSystem bankSystem;

    public AtmMachineFacade() {
        atmMachine = new AtmMachine();
        bankSystem = new BankSystem();
    }

    public void withdrawMoney() {
        atmMachine.enterPin();
        if (bankSystem.validatePin() && bankSystem.validateTransaction()) {
            atmMachine.withdrawCash();
        }
    }
}

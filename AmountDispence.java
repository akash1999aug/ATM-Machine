package com.example.ATM2;

public class AmountDispense {

    private DispenseTopUpChain chainStart;

    public AmountDispense() {

        // initialize the chain
        this.chainStart = new Rupee2000DispenseTopUp();
        DispenseTopUpChain chain500 = new Rupee500DispenseTopUp();
        DispenseTopUpChain chain200 = new Rupee200DispenseTopUp();
        DispenseTopUpChain chain100 = new Rupee100DispenseTopUp();
        // set the chain of responsibility
        chainStart.setNextChain(chain500);
        chain500.setNextChain(chain200);
        chain200.setNextChain(chain100);

    }

    public DispenseTopUpChain getChainStart() {
        return chainStart;
    }
}

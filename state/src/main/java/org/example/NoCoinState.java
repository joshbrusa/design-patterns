package org.example;

public class NoCoinState implements VendingMachineState {
    VendingMachine vendingMachine;

    public NoCoinState(VendingMachine machine) {
        this.vendingMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("No coin inserted.");
    }

    @Override
    public void dispense() {
        System.out.println("Insert a coin first.");
    }
}

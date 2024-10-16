package org.example;

public class HasCoinState implements VendingMachineState {
    VendingMachine vendingMachine;

    public HasCoinState(VendingMachine machine) {
        this.vendingMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void pressButton() {
        System.out.println("Button pressed.");
        vendingMachine.setState(vendingMachine.getDispensingState());
    }

    @Override
    public void dispense() {
        System.out.println("Press the button to dispense.");
    }
}

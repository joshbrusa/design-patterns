package org.example;

public class DispensingState implements VendingMachineState {
    VendingMachine vendingMachine;

    public DispensingState(VendingMachine machine) {
        this.vendingMachine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Wait, dispensing item.");
    }

    @Override
    public void pressButton() {
        System.out.println("Already dispensing.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing item...");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }
}

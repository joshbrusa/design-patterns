package org.example;

public class State {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.pressButton();  // No coin inserted
        vendingMachine.insertCoin();   // Coin inserted
        vendingMachine.pressButton();  // Button pressed, dispensing
        vendingMachine.dispense();     // Dispensing item
    }
}
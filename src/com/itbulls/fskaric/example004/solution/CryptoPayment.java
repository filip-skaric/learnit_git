package com.itbulls.fskaric.example004.solution;

class CryptoPayment extends Payment {

    public CryptoPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        // Specifična logika za plaćanje kriptovalutama
        if (amount < 0) {
            throw new UnsupportedOperationException("Crypto payments do not support negative amounts.");
        }
        System.out.println("Processing crypto payment of " + amount);
    }
}
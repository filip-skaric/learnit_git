package com.itbulls.fskaric.example004.problem;

class CryptoPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        if (amount < 0) {
            throw new UnsupportedOperationException("Crypto payments do not support negative amounts.");
        }
        System.out.println("Processing a crypto payment of " + amount);
    }
}
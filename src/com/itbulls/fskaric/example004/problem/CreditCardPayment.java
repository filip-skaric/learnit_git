package com.itbulls.fskaric.example004.problem;

class CreditCardPayment extends Payment {
    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void processPayment(double amount) {
        // Logika specifična za plaćanje kreditnom karticom
        System.out.println("Processing a credit card payment of " + amount + " using card: " + creditCardNumber);
    }
}
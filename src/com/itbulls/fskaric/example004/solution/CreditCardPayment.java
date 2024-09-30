package com.itbulls.fskaric.example004.solution;

class CreditCardPayment extends Payment {
    private String creditCardNumber;

    public CreditCardPayment(double amount, String creditCardNumber) {
        super(amount);
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void processPayment() {
        // Specifična logika za plaćanje kreditnom karticom
        System.out.println("Processing credit card payment of " + amount + " using card: " + creditCardNumber);
    }
}
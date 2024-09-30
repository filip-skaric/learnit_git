package com.itbulls.fskaric.example004.solution;

public class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.processPayment();
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Payment creditCardPayment = new CreditCardPayment(100.0, "1234-5678-9876-5432");
        processor.processPayment(creditCardPayment);

        Payment cryptoPayment = new CryptoPayment(-200.0);
        processor.processPayment(cryptoPayment);
    }
}
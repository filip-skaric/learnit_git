package com.itbulls.fskaric.example004.problem;

public class PaymentProcessor {

    public void processPayment(Payment payment, double amount) {
        payment.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        Payment payment = new Payment();
        processor.processPayment(payment, 100.0);

        Payment creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        processor.processPayment(creditCardPayment, 200.0);
        
        Payment cryptoPayment = new CryptoPayment();
        processor.processPayment(cryptoPayment, -50.0);  // Ovo će baciti izuzetak
    }
}
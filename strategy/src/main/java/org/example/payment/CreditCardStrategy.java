package org.example.payment;

public class CreditCardStrategy implements PayStrategy {

    @Override
    public void pay(int cost) {
        System.out.println("Payment was successfully paid by credit card with cost = " + cost);
    }

    @Override
    public void refund() {
        System.out.println("Payment was successfully refund to credit card");
    }
}

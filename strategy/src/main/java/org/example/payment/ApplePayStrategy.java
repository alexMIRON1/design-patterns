package org.example.payment;

public class ApplePayStrategy implements PayStrategy {

    @Override
    public void pay(int cost) {
        System.out.println("Payment was successfully paid by apple pay with cost = " + cost);
    }

    @Override
    public void refund() {
        System.out.println("Payment was successfully refund to apple pay account");
    }
}

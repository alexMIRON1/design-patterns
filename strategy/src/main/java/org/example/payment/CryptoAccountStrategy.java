package org.example.payment;

public class CryptoAccountStrategy implements PayStrategy {
    @Override
    public void pay(int cost) {
        System.out.println("Payment was successfully paid by crypto account with cost = " + cost);
    }

    @Override
    public void refund() {
        System.out.println("Payment was successfully refund to crypto account");
    }
}

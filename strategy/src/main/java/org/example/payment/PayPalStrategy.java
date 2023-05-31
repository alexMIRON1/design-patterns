package org.example.payment;

public class PayPalStrategy implements PayStrategy {

    @Override
    public void pay(int cost) {
        System.out.println("Payment was successfully paid by pay pal with cost=" + cost);
    }

    @Override
    public void refund() {
        System.out.println("Payment was successfully refund to pay pal account");
    }
}

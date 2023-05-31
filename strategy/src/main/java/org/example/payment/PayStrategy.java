package org.example.payment;

public interface PayStrategy {
    void pay(int cost);
    void refund();
}

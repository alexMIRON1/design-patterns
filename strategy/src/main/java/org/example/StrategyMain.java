package org.example;


import org.example.payment.*;

import java.util.Scanner;

public class StrategyMain {
    private static final Scanner input = new Scanner(System.in);
    private static PayStrategy payStrategy;

    public static void main(String[] args) {
        choosePayStrategy();
        if (payStrategy != null) {
            makeOperation(payStrategy);
        }
    }

    private static void choosePayStrategy() {
        System.out.println("Choose payment method");
        System.out.println("1-ApplePay\n2-CreditCard\n3-CryptoAccount\n4-PayPal");
        int numberPaymentMethod = input.nextInt();
        switch (numberPaymentMethod) {
            case 1 -> payStrategy = new ApplePayStrategy();
            case 2 -> payStrategy = new CreditCardStrategy();
            case 3 -> payStrategy = new CryptoAccountStrategy();
            case 4 -> payStrategy = new PayPalStrategy();
            default -> {
                System.out.println("You've chosen wrong payment method");
                choosePayStrategy();
            }
        }
    }

    private static void makeOperation(PayStrategy payStrategy) {
        System.out.println("What kind of operation do you wanna make?\n1-Pay;\n2-Refund");
        int numberPaymentOperation = input.nextInt();
        int costOfPayment;
        if (numberPaymentOperation == 1) {
            System.out.println("What cost of your payment?: ");
            costOfPayment = input.nextInt();
            payStrategy.pay(costOfPayment);
        } else if (numberPaymentOperation == 2) {
            payStrategy.refund();
        } else {
            System.out.println("You've chosen wrong operation");
            makeOperation(payStrategy);
        }
    }
}

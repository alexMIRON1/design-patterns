package org.example;


import lombok.SneakyThrows;
import org.example.console.manager.ConsoleEmailManager;
import org.example.console.manager.ConsolePhoneManager;
import org.example.publisher.MessagePublisher;

import java.util.Random;
import java.util.Scanner;

public class ObserverMain {
    public static final Scanner INPUT = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    public static final MessagePublisher MESSAGE_PUBLISHER = new MessagePublisher();
    private static final ConsolePhoneManager CONSOLE_PHONE_MANAGER = new ConsolePhoneManager();
    private static final ConsoleEmailManager CONSOLE_EMAIL_MANAGER = new ConsoleEmailManager();

    @SneakyThrows
    public static void main(String[] args) {
        Thread notificationThread = new Thread(() -> {
            while (true) {
                sendNotification();
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        notificationThread.start();
        CONSOLE_EMAIL_MANAGER.subscribeByEmail();
        CONSOLE_PHONE_MANAGER.subscribeByPhone();
        if (CONSOLE_EMAIL_MANAGER.isSubscribedByEmail()) {
            CONSOLE_EMAIL_MANAGER.unsubscribeByEmail();
        }
        if (CONSOLE_PHONE_MANAGER.isSubscribedByPhone()) {
            CONSOLE_PHONE_MANAGER.unsubscribeByPhone();
        }
        notificationThread.interrupt();
    }


    private static void sendNotification() {
        MESSAGE_PUBLISHER.publish("new message " + RANDOM.nextInt());
    }
}

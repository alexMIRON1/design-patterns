package org.example.console.manager;

import org.example.ObserverMain;
import org.example.UserResponse;
import org.example.subscriber.EmailSubscriber;
import org.example.subscriber.EventSubscriber;


public class ConsoleEmailManager {
    private final EventSubscriber<String> emailSubscriber = new EmailSubscriber();

    public void subscribeByEmail() {
        System.out.println("Do you wanna subscribe by email?\nYes/No");
        String response = ObserverMain.INPUT.nextLine();
        if (response.equalsIgnoreCase(UserResponse.YES.name())) {
            ObserverMain.MESSAGE_PUBLISHER.subscribe(emailSubscriber);
        }
    }

    public void unsubscribeByEmail() {
        System.out.println("Do you wanna unsubscribe by email?\nYes/No");
        String response = ObserverMain.INPUT.nextLine();
        if (response.equalsIgnoreCase(UserResponse.YES.name())) {
            ObserverMain.MESSAGE_PUBLISHER.unsubscribe(emailSubscriber);
        }
    }

    public boolean isSubscribedByEmail() {
        return ObserverMain.MESSAGE_PUBLISHER.getEventSubscribers().contains(emailSubscriber);
    }
}

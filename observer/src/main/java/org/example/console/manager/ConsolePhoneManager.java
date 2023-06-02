package org.example.console.manager;

import org.example.ObserverMain;
import org.example.UserResponse;
import org.example.subscriber.EventSubscriber;
import org.example.subscriber.PhoneSubscriber;

public class ConsolePhoneManager {
    private final EventSubscriber<String> phoneSubscriber = new PhoneSubscriber();

    public void subscribeByPhone() {
        System.out.println("Do yuu wanna subscribe by phone?\nYes/No");
        String response = ObserverMain.INPUT.nextLine();
        if (response.equalsIgnoreCase(UserResponse.YES.name())) {
            ObserverMain.MESSAGE_PUBLISHER.subscribe(phoneSubscriber);
        }
    }

    public void unsubscribeByPhone() {
        System.out.println("Do you wanna unsubscribe by phone?\nYes/No");
        String response = ObserverMain.INPUT.nextLine();
        if (response.equalsIgnoreCase(UserResponse.YES.name())) {
            ObserverMain.MESSAGE_PUBLISHER.unsubscribe(phoneSubscriber);
        }
    }

    public boolean isSubscribedByPhone() {
        return ObserverMain.MESSAGE_PUBLISHER.getEventSubscribers().contains(phoneSubscriber);
    }
}

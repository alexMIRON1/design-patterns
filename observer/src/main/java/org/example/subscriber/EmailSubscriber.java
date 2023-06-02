package org.example.subscriber;

import java.util.ArrayList;
import java.util.List;

public class EmailSubscriber implements EventSubscriber<String> {
    private final List<String> emailsMessage = new ArrayList<>();

    @Override
    public void update(String message) {
        System.out.println("Message was received in email: " + message);
        this.emailsMessage.add(message);
        System.out.println("was update list of emails: " + emailsMessage);
    }
}

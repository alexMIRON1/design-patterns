package org.example.subscriber;

import java.util.ArrayList;
import java.util.List;

public class PhoneSubscriber implements EventSubscriber<String> {
    private final List<String> phoneMessages = new ArrayList<>();

    @Override
    public void update(String message) {
        System.out.println("Message was received in phone " + message);
        this.phoneMessages.add(message);
        System.out.println("List of phone messages was update " + phoneMessages);
    }
}

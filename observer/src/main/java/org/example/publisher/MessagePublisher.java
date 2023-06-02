package org.example.publisher;

import org.example.subscriber.EventSubscriber;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements EventPublisher<String>{
    private final List<EventSubscriber<String>> eventSubscribers = new ArrayList<>();
    @Override
    public void subscribe(EventSubscriber<String> eventSubscriber) {
        this.eventSubscribers.add(eventSubscriber);
    }

    @Override
    public void unsubscribe(EventSubscriber<String> eventSubscriber) {
        this.eventSubscribers.remove(eventSubscriber);
    }
    @Override
    public void publish(String message) {
        eventSubscribers.forEach(eventSubscriber -> eventSubscriber.update(message));
    }

    public List<EventSubscriber<String>> getEventSubscribers() {
        return eventSubscribers;
    }
}

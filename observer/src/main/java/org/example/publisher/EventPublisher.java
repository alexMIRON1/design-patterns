package org.example.publisher;

import org.example.subscriber.EventSubscriber;

public interface EventPublisher<T> {
    void subscribe(EventSubscriber<T> eventSubscriber);
    void unsubscribe(EventSubscriber<T> eventSubscriber);
    void publish(T message);
}

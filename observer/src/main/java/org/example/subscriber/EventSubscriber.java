package org.example.subscriber;

public interface EventSubscriber<T> {
    void update(T object);
}

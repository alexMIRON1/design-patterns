# Design-patterns
## Design Pattern:Strategy

Task: Implementing a Payment Strategy

Description:
Your task is to implement a payment strategy system that allows users to choose different payment methods for online transactions.
The strategy pattern enables the selection of an algorithm or behavior at runtime.

Requirements:

1. Create a payment strategy interface that defines a common set of methods, such as pay(amount) and refund(amount).
2. Implement multiple payment strategies that conform to the payment strategy interface (e.g., credit card, PayPal, or cryptocurrency).
3. Design a client program that prompts the user to select a payment method and process a payment or refund using the chosen strategy.
4. The client program should provide options for the user to input transaction details, such as the transaction amount.
5. Demonstrate the functionality of your payment strategy system by allowing users to successfully process payments or refunds using different payment methods.


## Design Pattern: Factory

Task: Creating a Vehicle Factory

Description:
Your task is to design and implement a vehicle factory using the factory pattern.
The factory pattern encapsulates the creation of objects and provides a centralized place for object creation.

Requirements:

1. Define an abstract vehicle class that serves as the base class for different types of vehicles (e.g., car, motorcycle, or bicycle).
2. Implement concrete classes for each type of vehicle, inheriting from the abstract vehicle class.
3. Create a vehicle factory class that provides a method for creating vehicles based on user input or predefined configurations.
4. The factory should encapsulate the creation logic and return an instance of the appropriate vehicle type.
5. Develop a client program that utilizes the vehicle factory to create and interact with different vehicles.
6. Demonstrate the functionality of your vehicle factory by creating vehicles of different types and performing actions specific to each vehicle type.

Note: Command Line prompts user to what type of vehicle create.


## Design Pattern: Builder

Task: Building a House using the Builder Pattern

Description:
Your task is to design and implement a system for building houses using the builder pattern. The builder pattern separates the construction of complex objects from their representation, allowing the same construction process to create different representations.

Requirements:

1. Define a house builder interface that outlines the construction steps and methods needed to build a house.
2. Implement concrete builder classes that implement the house builder interface, each representing a specific type or style of house (e.g., modern, traditional, or eco-friendly).
3. Create a director class that takes a builder object and constructs a house based on a predefined process or user preferences.
4. The director class should be responsible for coordinating the construction steps and returning the final house object.
5. Develop a client program that utilizes the director and different builders to construct houses with different styles and features.
6. Demonstrate the functionality of your house builder system by creating houses of different types and displaying their specifications.

## Design Pattern: Observer

Task: Implementing an Event Notification System

Description:
Your task is to implement an event notification system using the observer pattern. The observer pattern establishes a one-to-many relationship between objects, where the changes in one object trigger updates in other dependent objects.

Requirements:

1. Define an event publisher interface that includes methods for subscribing, unsubscribing, and notifying observers.
2. Implement an event publisher class that maintains a list of observers and provides methods to manage the observer list.
3. Define an event subscriber interface that includes a method for receiving and processing event notifications.
4. Implement multiple event subscriber classes that conform to the event subscriber interface.
5. Develop a client program that demonstrates the event notification system by publishing events and observing the responses from the subscribers.
6. Show how the system handles dynamic subscription and unsubscription of observers during runtime.

Note: Create Command Line commands to subscribe on event, to unsubscribe on event, and to get notification about event.

## Design Pattern: Chain of Responsibility

Task: Creating a Help Desk Ticketing System

Description:
Your task is to design and implement a help desk ticketing system using the chain of responsibility pattern. The chain of responsibility pattern allows an object to pass a request along a chain of potential handlers until it is handled or reaches the end of the chain.

Requirements:

1. Define a help desk ticket class that contains information about a customer's support request (e.g., name, issue description, priority).
2. Implement an abstract handler class that defines the common methods and properties for handling help desk tickets.
3. Create concrete handler classes that inherit from the abstract handler class and represent different levels or types of support personnel (e.g., level 1 support, level 2 support, or supervisor).
3. Establish the chain of responsibility by linking the handler objects together in a way that allows the ticket to pass through the chain until it is appropriately handled.
4. Develop a client program that allows users to submit help desk tickets and observe the handling process as the tickets move through the chain.
5. Show how the system handles different ticket priorities and how the chain of responsibility can be modified or extended without modifying the client code.


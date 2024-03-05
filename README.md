# Design Patterns

- [x] Facade
- [x] Builder
- [x] Factory
- [x] Memento
- [x] Observer
- [x] Singleton

# OOP CONCEPTS

- [x] Inheritance
    - [x] Interfaces
- [x] Encapsulation
- [x] Constructors
- [x] Abstraction 
- [x] Objects

# Reactive Programming
- It's a programming paradigm where the focus is on 
  developing asynchronous and non-blocking applications 
  in an event-driven form
  
## Advantages
- Asynchronous and non-blocking
- Event/Message Driven stream data flow
- Functional style code(lambdas)
- Back Pressure

- Publisher - interface that will be used to register 
		the subscriber to the publisher.

```java
public interface Publisher<T>{
	public void subscribe(Subscriber<? super T> s);
}
```

- Subscriber - Subscribes to the publisher's events

```java
public interface Subscriber<T>{
	public void onSubscribe(Subscription s);
	public void onNext(T t);
	public void onError(Throwable t);
	public void onComplete();
}
```

### Using Spring Boot (Project Reactor)
- [] Mono
- [] Flux

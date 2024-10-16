# State

The State Pattern is a behavioral design pattern that allows an
object to change its behavior when its internal state changes.
This is achieved by encapsulating different behaviors (or states)
into separate classes and allowing the object to switch between
these states at runtime. It helps eliminate complex conditional
logic that checks for various states, making the code more maintainable and extensible.

## Pros

- Encapsulation: State-specific behavior is encapsulated in separate state classes, leading to cleaner, more organized code.
- Open/Closed Principle: Easy to add new states without modifying existing code.
- Simplifies logic: Eliminates complex conditionals (if-else, switch statements).
- Improved maintainability: Each state is independent and can be modified without affecting others.
- Reusability: State objects can be reused across different contexts.

## Cons

- Increased complexity: Requires creating multiple classes for each state, which might seem unnecessary for simple systems.
- Increased memory usage: More objects in memory due to multiple state instances.
- Harder to debug: More indirection can make it harder to track state transitions.
- Verbose: Can lead to more code and boilerplate when compared to simpler solutions.
- Overhead: Might introduce unnecessary overhead for systems with few state transitions.

# Strategy

The Strategy Pattern is a behavioral design pattern that allows a class to
choose the algorithm or strategy at runtime. It promotes flexibility by
enabling algorithms to be swapped in and out without modifying the context
class. In the example, we define different payment methods as strategies,
allowing the shopping cart to use any payment method at runtime.

## Pros

- Open/Closed Principle: New strategies can be added without modifying the context class.
- Encapsulation: Each strategy is encapsulated in its own class, making it reusable and easy to maintain.
- Code Organization: Algorithms are separated into distinct classes, promoting cleaner code.
- Runtime Flexibility: Clients can switch strategies at runtime based on needs.
- Reduces Conditional Logic: Avoids the use of conditionals by using polymorphism to handle various strategies.

## Cons

- Increased Number of Classes: Can lead to an explosion of classes since each strategy requires its own class.
- Complexity: Overhead of managing multiple strategy classes may increase the complexity of the system.
- Context Dependence: Requires context classes to be aware of and manage strategies, which can lead to tight coupling if not handled properly.
- Overkill for Simple Tasks: For simple algorithms, using the Strategy Pattern can be over-engineering.
- No Control Over Strategy: The client is responsible for choosing the right strategy, which could lead to incorrect selections if not managed carefully.

# Visitor

The Visitor Pattern is a behavioral design pattern that allows you 
to define new operations on a set of objects without changing the
objects themselves. This is achieved by externalizing the operations
into visitor objects, which traverse the structure of elements,
performing the desired actions on each element type. It promotes
open/closed principle, as it allows extension of functionality
without modifying existing code.

## Pros

- Separation of concerns: Keeps operations separate from object structures.
- Extensibility: Adding new operations is straightforward without modifying existing element classes.
- Simplifies class hierarchy: Reduces the need to clutter element classes with multiple methods.
- Visitor independence: Visitors are independent and can vary in functionality.
- Adherence to the Open/Closed Principle: You can add new behaviors without altering existing element classes.

## Cons

- Adding new elements is hard: Introducing new element types requires changing all existing visitors.
- Tight coupling: Visitor and element structures become tightly coupled.
- Complex structure: Managing visitors and elements can make code harder to maintain.
- Violation of Encapsulation: The pattern may require exposing internal details of elements.
- Maintenance overhead: Each new visitor requires an update to all elements, making changes tedious.

# Bridge

The Bridge Pattern is a structural design pattern that decouples an abstraction from its implementation, allowing them
to vary independently. This pattern involves an abstraction class that delegates the actual work to an implementor
interface, which has multiple concrete implementations. In the example above, Shape is the abstraction, DrawingAPI is
the implementor, and CircleShape is the refined abstraction that utilizes the implementor interface to perform
operations like drawing and resizing.

## Pros

- Decoupling: It decouples the abstraction from its implementation, allowing them to evolve independently.
- Flexibility: Enhances flexibility by enabling both abstraction and implementation to vary without affecting each
  other.
- Simplifies Code: Simplifies code maintenance and enhances readability by separating concerns.
- Enhanced Scalability: Facilitates scalable designs by adding new abstraction and implementation classes easily.
- Increased Reusability: Promotes code reuse by allowing different implementations to be used interchangeably.

## Cons

- Complexity: Introduces additional layers of abstraction, increasing the complexity of the codebase.
- Learning Curve: Can be difficult to understand and implement for developers unfamiliar with the pattern.
- Overhead: May introduce unnecessary overhead if not used appropriately, especially for simple scenarios.
- Increased Number of Classes: Results in more classes and interfaces, which can clutter the codebase.
- Potential for Misuse: Can be misused or overused, leading to a design that is more complicated than necessary.

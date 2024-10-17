# Template Method

The Template Method Pattern allows a superclass to define the structure
of an algorithm, while subclasses provide specific implementations for
the steps. In this example, Game defines a play() method that outlines
the steps of a game (initializing, starting, and ending). Subclasses such
as Football and Chess implement the details for these steps. This pattern
promotes code reuse by centralizing the invariant parts of the algorithm
and pushing variant behaviors to subclasses.

## Pros

- Code reuse: Common logic is defined once in the superclass, allowing subclasses to reuse it.
- Flexibility: Subclasses can define custom implementations for specific steps without changing the overall algorithm.
- Control of the algorithm: The template method ensures that the algorithm follows a specific structure.
- Easy maintenance: Modifying the structure of the algorithm in the template method will affect all subclasses, simplifying updates.
- Encapsulation of invariant parts: The parts of the algorithm that don’t change are encapsulated in the template, reducing duplication.

## Cons

- Restricted flexibility: Subclasses are forced to follow the algorithm structure as defined by the template method.
- Increased complexity: The pattern introduces an extra layer of abstraction, which can make the code harder to follow.
- Less subclass freedom: Subclasses cannot alter the sequence of steps, only provide step-specific implementations.
- Potential code duplication: If subclasses have significantly different algorithms, the pattern might force code duplication or awkward solutions.
- Overriding risk: Subclasses might incorrectly override abstract methods, potentially breaking the algorithm's flow.

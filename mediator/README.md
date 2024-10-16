# Mediator

The Mediator Pattern centralizes communication between objects by using a
mediator, allowing objects to interact without being directly coupled to
each other. This pattern is especially useful in systems where many objects
need to communicate but tight coupling would make the system complex and
hard to maintain.

## Pros

- Reduces Coupling: Objects don't need to refer to each other, reducing dependencies.
- Improves Maintainability: Changes to interaction logic are centralized in the mediator, simplifying updates.
- Encapsulates Interaction: Complex interactions between objects are handled by the mediator, improving readability.
- Promotes Reusability: Objects can be reused in different contexts without modification.
- Simplifies Object Behavior: Each object focuses on its own logic without managing interactions.

## Cons

- Mediator Complexity: The mediator can become a "God object" if it grows too large.
- Single Point of Failure: If the mediator fails, the entire system's communication breaks down.
- Difficult to Extend: Adding new interactions may require significant changes to the mediator.
- Hidden Dependencies: The indirect communication via the mediator may make dependencies between objects less obvious.
- Potential Performance Issues: The mediator adds a layer of indirection, which might introduce performance overhead in large systems.

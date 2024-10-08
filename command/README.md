# Command

The Command Pattern encapsulates a request as an object, thereby decoupling
the sender of the request from the receiver. It allows for operations like
queuing requests, undoing actions, and more flexible system design by enabling
clients to parameterize objects with different commands. This pattern is
especially useful in scenarios where multiple requests need to be handled or
extended in the future.

## Pros

- Decoupling: Separates the object that invokes the operation from the one that knows how to perform it.
- Easily Extensible: New commands can be added without modifying existing classes.
- Support for Undo/Redo: Commands can store state for undo/redo functionality.
- Batch Execution: Commands can be queued, scheduled, or logged.
- Encapsulates Complex Operations: Complex operations can be simplified into manageable command objects.

## Cons

- Increase in Number of Classes: Each command is a separate class, which can result in many small classes.
- Complexity: It adds an extra layer of abstraction, which might overcomplicate simple operations.
- Command Object Management: Managing command objects in memory can become cumbersome if not handled properly.
- Tight Coupling in Command Classes: Commands often have a tight coupling with the receiver classes.
- Harder to Debug: Debugging can be tricky due to indirect interactions between invoker and receiver.

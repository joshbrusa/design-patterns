# Memento

The Memento Pattern is a design pattern that stores the internal
state of an object without exposing its implementation, allowing
the object to return to previous states later. It involves three
components: Originator, which holds the state; Memento (Snapshot here),
which stores the state; and Caretaker, which manages mementos. This
pattern is commonly used to implement undo/redo operations in
applications where states need to be saved and restored.

## Pros

- Encapsulation of State: The internal state of the object is hidden from other objects.
- Supports Undo/Redo: Enables easy implementation of undo/redo functionality.
- Preserves Object Integrity: The state can be restored without violating object encapsulation.
- Simplifies Caretaker: The caretaker only stores the memento and doesn’t alter the state.
- Useful for Testing: Allows saving different states for testing multiple scenarios.

## Cons

- Memory Overhead: Storing multiple mementos can consume significant memory, especially with large objects.
- No Incremental Change: Entire states are saved, even if only small changes are made.
- Complexity in Managing Mementos: Keeping track of multiple mementos can become difficult.
- Increased Maintenance: Requires extra classes for each saved state, increasing code complexity.
- Potential Violation of Single Responsibility Principle: The originator both creates and restores states, mixing responsibilities.

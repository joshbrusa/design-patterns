# Iterator

The Iterator Pattern in Java provides a standardized way to access the elements
of a collection without exposing its underlying structure. It allows the traversal
of different types of collections (e.g., lists, sets) using a common interface
(Iterator). By separating how the collection is traversed from the actual data
structure, this pattern enhances flexibility and adheres to the Single Responsibility
and Open/Closed Principles. Custom iterator implementations can be created to offer
even more tailored traversal behaviors, making it a key part of the behavioral
design patterns in object-oriented programming.

## Pros

- Encapsulation: It hides the internal structure of the collection, exposing only necessary operations for traversal.
- Flexibility: Different types of collections (like lists, sets) can be traversed using a uniform interface.
- Simplifies traversal: Simplifies complex data structure traversal by providing an easy and consistent way.
- Custom Iteration: Can define custom iterators that control how data is iterated (e.g., reverse iteration).
- Decouples logic: Decouples iteration logic from the actual collection, following the Single Responsibility Principle.

## Cons

- Memory overhead: May increase memory usage, especially with large collections, due to the creation of iterator objects.
- Limited functionality: Basic iterators do not support advanced operations like adding/removing elements during iteration.
- Inflexible if state changes: Iterators may fail when the collection changes during iteration, leading to ConcurrentModificationException.
- No built-in reverse iteration: Standard Java iterators do not support reverse traversal without additional implementation.
- Lacks parallel traversal: Iterators are not inherently thread-safe, requiring extra handling in concurrent environments.

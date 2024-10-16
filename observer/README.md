# Observer

The Observer pattern defines a one-to-many relationship between objects
so that when one object (the subject) changes its state, all its
dependent objects (observers) are notified and updated automatically.
It decouples the subject from its observers, promoting loose coupling
and flexibility in communication. This is useful in scenarios where
changes to an object need to trigger updates in other objects, like in
the example where multiple displays update when the weather station changes its temperature.

## Pros

- Decouples subject and observer: Reduces direct dependency, promoting flexibility.
- Supports broadcast communication: One subject can notify multiple observers at once.
- Simplifies maintainability: Adding new observers or modifying them doesn't require changing the subject.
- Promotes code reusability: Observers can be reused with different subjects.
- Supports dynamic relationships: Observers can be added or removed at runtime.

## Cons

- Potential performance issues: If there are many observers, notifications can become inefficient.
- Unexpected updates: Observers might get notified too frequently, leading to unnecessary processing.
- Harder to debug: With multiple observers, it can be difficult to trace back the source of updates or errors.
- Tight event loop: Overuse can lead to complex, interdependent update chains, making it hard to manage.
- Memory leaks: Failing to remove observers can lead to memory issues, as they may continue to be notified.

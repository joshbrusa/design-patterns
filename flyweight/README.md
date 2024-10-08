# Flyweight

The Flyweight pattern is a structural design pattern that reduces memory usage
by sharing as much data as possible with similar objects. This pattern is especially
useful when working with large numbers of small objects that share common properties.
In this Java example, circles of various colors are reused instead of creating new
ones every time, saving memory and optimizing performance. The pattern involves a
Flyweight Factory that manages the object pool and returns shared instances.

## Pros

- Reduced memory usage by reusing similar objects.
- Improved performance when handling large volumes of small objects.
- Encapsulation of intrinsic and extrinsic data for better management.
- Flexibility in the Flyweight object for state management.
- Cleaner code with object pooling for reusable instances.

## Cons

- Complexity added with the management of the Flyweight factory.
- Less transparency because some objects might share data.
- Limited flexibility for objects that need to differ significantly.
- Increased responsibility on the client to manage extrinsic states.
- Harder debugging due to the shared state across multiple objects.

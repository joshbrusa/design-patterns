# Builder

The Builder pattern is a creational design pattern that facilitates the construction of complex objects by separating
the process of constructing an object from its final representation. It allows for step-by-step construction of objects,
enabling the setting of optional parameters in a readable and flexible manner without requiring numerous constructor
overloads. This pattern is particularly useful for creating immutable objects with many parameters, as it encapsulates
the construction logic within a builder class, which offers methods to set various parameters and a final method to
build the object. This results in more maintainable and readable code, especially for objects with multiple
configuration options.

## Pros

- Improved Readability: The Builder pattern allows for clear and readable code, especially when dealing with objects
  that have many parameters. Method chaining makes it easy to understand what values are being set.
- Immutable Objects: By using the Builder pattern, you can create immutable objects since all fields are set during the
  object construction phase and there's no need for setters.
- Encapsulation: The complex construction logic is encapsulated within the builder, hiding it from the client. This
  results in cleaner and more maintainable code.
- Flexibility: The Builder pattern makes it easy to construct different representations of the object with minimal
  changes. You can add or remove parameters without affecting existing code.
- Reduction of Constructor Overloading: It avoids the problem of having too many constructor overloads to handle
  different parameter combinations, leading to simpler and more maintainable code.

## Cons

- Increased Complexity: The Builder pattern introduces additional complexity to the codebase, with the need to create a
  separate builder class and methods for setting each parameter.
- More Boilerplate Code: Implementing the Builder pattern requires writing a lot of boilerplate code, including the
  builder class, methods for each parameter, and the build method.
- Larger Memory Footprint: Using the Builder pattern can lead to a larger memory footprint since the builder object
  itself consumes memory in addition to the object being constructed.
- Performance Overhead: There might be a slight performance overhead due to the creation and use of the builder object,
  which can be a concern in performance-critical applications.
- Limited Usefulness for Simple Objects: For objects with only a few parameters or when the object construction process
  is straightforward, the Builder pattern might be overkill and add unnecessary complexity.

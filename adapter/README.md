# Adapter

The Adapter Pattern allows incompatible interfaces to work together by converting the interface of a class into another
interface that a client expects. This pattern involves a single class, the adapter, which is responsible for joining
functionalities of independent or incompatible interfaces. It is especially useful when integrating new components into
existing systems without altering the original codebase.

## Pros

- Increased Reusability: Facilitates the reuse of existing functionality, enabling new systems to leverage old code.
- Enhanced Flexibility: Promotes flexibility in systems by allowing objects with incompatible interfaces to interact.
- Simplifies Client Code: Hides the complexity of the adaptee and provides a simple interface for the client.
- Promotes Decoupling: Helps in decoupling the client from the concrete implementation of components.
- Encourages Code Maintenance: Adapting legacy code to new interfaces improves maintainability without modifying the
  original code.

## Cons

- Increased Complexity: Introduces additional layers of abstraction, which can complicate the system architecture.
- Performance Overhead: Can introduce slight performance overhead due to additional method calls.
- Code Redundancy: May lead to redundant code if multiple adapters are needed for different interfaces.
- Limited Functionality: The adapter can only offer functionality that is present in the adaptee, limiting
  extensibility.
- Maintenance Burden: Maintaining adapter classes can become a burden, especially when changes are needed in the adapted
  interfaces.

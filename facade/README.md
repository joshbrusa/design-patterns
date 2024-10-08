# Facade

The Facade pattern simplifies the interaction with complex subsystems by providing a
single unified interface. In this example, the HomeTheaterFacade wraps the functionality
of multiple components (Amplifier, DvdPlayer, and Projector) and offers an easy-to-use
interface for watching and stopping a movie. This helps users interact with the system
without needing to know the intricate details of each subsystem.

## Pros

- Simplifies complex systems: Offers a clear and simple interface to interact with complex subsystems.
- Reduces dependency on subsystem details: Clients depend only on the facade and not on the intricate implementation details of the subsystems.
- Increases code readability: Client code becomes more readable and maintainable since the facade handles multiple subsystem interactions.
- Encourages loose coupling: Subsystems can change without affecting the client code, as long as the facade interface remains the same.
- Better structure: It organizes code and separates concerns, making it easier to manage and extend.

## Cons

- Introduces another layer: The facade adds an additional layer of abstraction, which could lead to inefficiency if not designed carefully.
- Limited flexibility: If clients need advanced functionality from the subsystems, the facade might oversimplify and hide important features.
- Harder to modify: Changes to the facade can impact many areas of the code, especially if used widely.
- Risk of God-object: If the facade class handles too many responsibilities, it can become a God object, which violates the single responsibility principle.
- Not suitable for all cases: It may not be appropriate for smaller systems where direct access to subsystems is simple and doesn't require abstraction.

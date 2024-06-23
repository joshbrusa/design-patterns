# Singleton

The Singleton pattern ensures that a class has only one instance and provides a global point of access to it. This is
achieved by making the class constructor private and using a static method to manage the instance creation and access.
In the provided example, the Singleton class has a private static variable to hold the single instance and a public
static method getInstance() to return that instance, initializing it if it doesn't already exist. This pattern is
particularly useful in scenarios where a single point of control is required, such as configuration settings, logging,
or connection pooling.

## Pros

- Controlled Access to a Single Instance: Ensures that a class has only one instance and provides a global point of
  access.
- Lazy Initialization: The instance is created only when it is needed, which can improve performance if the
  initialization is resource-intensive.
- Reduced Memory Footprint: Only one instance of the class is created, which can save memory in resource-constrained
  environments.
- Consistency: Ensures that all parts of an application use the same instance, which can simplify debugging and
  maintenance.
- Encapsulation of Instance Control: The class itself controls the creation and access to the instance, preventing
  external classes from creating new instances.

## Cons

- Global State: Introduces a global state into an application, which can make debugging and testing more difficult.
- Concurrency Issues: If not implemented correctly, the Singleton pattern can introduce synchronization issues in a
  multi-threaded environment.
- Limited Scalability: Since only one instance exists, it can become a bottleneck if that instance needs to handle many
  tasks or requests.
- Difficulty in Subclassing: The Singleton pattern can be difficult to subclass, as the instance management is tightly
  controlled by the class itself.
- Hidden Dependencies: Classes that use the Singleton pattern can become tightly coupled to the Singleton instance,
  leading to hidden dependencies that can make the code less modular and harder to test.

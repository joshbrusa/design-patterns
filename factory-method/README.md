# Factory Method

The Factory Method Pattern defines an interface for creating an object, but allows subclasses to alter the type of
objects that will be created. Instead of calling a constructor directly to create an object, a factory method is called.
This pattern promotes loose coupling by eliminating the need to bind application-specific classes into the code. The
code interacts solely with the resultant product interface, which makes the code more flexible and extensible.

## Pros

- Encapsulation of object creation: The pattern encapsulates the instantiation process, which helps in managing and
  controlling how objects are created.
- Enhances flexibility: It provides a way to add new types of products without changing existing code, following the
  open/closed principle.
- Promotes code reuse: Common code related to the creation process can be placed in the creator class, reducing
  redundancy.
- Facilitates testing: It allows for easier testing by mocking the product creation. 
- Supports polymorphism: It makes use of polymorphism by defining a common interface for products and letting
  subclasses define the specific product creation.

## Cons

- Increased complexity: Introducing the factory method pattern adds additional classes and interfaces, which can
  increase the overall complexity of the codebase.
- Requires subclassing: To create a new type of product, you must create a new subclass, which might not be ideal in
  some scenarios.
- Can lead to class explosion: If many different products are needed, the number of classes can grow rapidly, leading
  to a large number of small classes.
- Difficult to debug: Tracing through the code can become more difficult because of the added abstraction layer.
- Potential for overuse: The pattern can be overused, especially in cases where simple instantiation would suffice,
  leading to unnecessarily complicated code.

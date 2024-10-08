# Proxy

The Proxy Pattern provides a surrogate or placeholder for another object to
control access to it. In the above example, ProxyImage controls the creation
and display of a RealImage. The image is loaded from disk only when needed,
and subsequent calls simply display the already-loaded image, improving performance
by avoiding redundant object creation.

## Pros

- Lazy Initialization: Objects are created only when needed, improving resource usage.
- Access Control: Can restrict or log access to certain objects.
- Performance Optimization: Enhances performance by loading or initializing heavy objects on demand.
- Separation of Concerns: Keeps the client code simpler by handling resource-intensive operations in the proxy.
- Protection: Useful for adding extra layers of validation, like checking access rights.

## Cons

- Increased Complexity: Adds an extra layer of abstraction, making the design more complex.
- Slower Access: The additional proxy object may introduce some performance overhead in certain cases.
- Code Duplication: Similar methods often need to be implemented in both the proxy and the real object.
- Maintenance Overhead: Managing and maintaining proxies can increase the complexity of the system.
- Not Always Necessary: In cases where the proxy does little to optimize or protect the system, it can be over-engineering.

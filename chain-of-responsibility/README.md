# Chain of Responsibility

The Chain of Responsibility pattern allows an object to send a request
without knowing which object in the chain will handle it. Each handler in
the chain can either process the request or pass it to the next handler.
This pattern promotes loose coupling between the sender and receiver and
provides flexibility to add or change handlers dynamically.

## Pros

- Decoupling of senders and receivers: The client doesn't need to know which handler processes the request.
- Flexibility: Handlers can be added, removed, or rearranged without affecting the clients.
- Simplifies object relationships: Instead of having multiple conditional checks, the request is passed down the chain.
- Single Responsibility Principle: Each handler class has only one responsibility: to either process the request or pass it.
- Ease of extending behavior: New handlers can be added easily to enhance functionality without changing existing code.

## Cons

- Possible performance hit: If the chain is long, performance may degrade as the request is passed through multiple handlers.
- No guaranteed handling: If no handler is capable of processing the request, it may go unhandled unless explicitly accounted for.
- Complexity: The chain can become complex and harder to manage as the number of handlers increases.
- Order dependency: The processing order matters, and if not managed carefully, it may lead to incorrect behavior.
- Difficult debugging: Since the request can pass through many objects, identifying where an issue occurred can be challenging.

# Software design pattern in Java & Python

## Behavioral patterns

### 1. Chain of Responsibility
The Chain of Responsibility pattern allows multiple objects to handle a request in a sequential manner, passing the request along a chain of potential handlers. Each handler decides whether to process the request or pass it to the next handler in the chain. This pattern decouples the sender of the request from the receiver, providing flexibility in determining how requests are processed. It's often used for event handling, logging, or approval workflows.

[Java example](src/main/java/com/example/patterns/behavioral/chain_of_responsibility/)


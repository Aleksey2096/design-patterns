# Software design pattern in Java & Python

## Behavioral patterns

### 1. Chain of Responsibility
The Chain of Responsibility pattern allows multiple objects to handle a request in a sequential manner, passing the request along a chain of potential handlers. Each handler decides whether to process the request or pass it to the next handler in the chain. This pattern decouples the sender of the request from the receiver, providing flexibility in determining how requests are processed. It's often used for event handling, logging, or approval workflows.

[Java example](src/main/java/com/example/patterns/behavioral/chain_of_responsibility/)

### 2. Command
The Command pattern encapsulates a request as an object, allowing clients to parameterize methods with different requests, queue requests, and log or undo them. This pattern provides a way to decouple the object that sends a command from the object that knows how to execute it. Commands can be stored, passed, and executed at a later time, supporting undo and redo operations. It's commonly used in menu-driven interfaces, transactional systems, and macro recording.

[Java example](src/main/java/com/example/patterns/behavioral/command/) (In this example the text editor creates new command objects each time a user interacts with it. After executing its actions, a command is pushed to the history stack. To perform the undo operation, the application takes the last executed command from the history and either performs an inverse action or restores the past state of the editor, saved by that command.)
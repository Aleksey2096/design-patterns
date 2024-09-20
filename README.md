# Software design pattern in Java & Python

## Behavioral patterns

### 1. Chain of Responsibility
The Chain of Responsibility pattern allows multiple objects to handle a request in a sequential manner, passing the request along a chain of potential handlers. Each handler decides whether to process the request or pass it to the next handler in the chain. This pattern decouples the sender of the request from the receiver, providing flexibility in determining how requests are processed. It's often used for event handling, logging, or approval workflows.

[Java example](src/main/java/com/example/patterns/behavioral/chain_of_responsibility/)

### 2. Command
The Command pattern encapsulates a request as an object, allowing clients to parameterize methods with different requests, queue requests, and log or undo them. This pattern provides a way to decouple the object that sends a command from the object that knows how to execute it. Commands can be stored, passed, and executed at a later time, supporting undo and redo operations. It's commonly used in menu-driven interfaces, transactional systems, and macro recording.

[Java example](src/main/java/com/example/patterns/behavioral/command/) (In this example the text editor creates new command objects each time a user interacts with it. After executing its actions, a command is pushed to the history stack. To perform the undo operation, the application takes the last executed command from the history and either performs an inverse action or restores the past state of the editor, saved by that command.)

### 3. Interpreter
The Interpreter pattern defines a representation for a grammar of a language and provides an interpreter to process sentences in the language. Each rule in the grammar is represented by a class, and the interpreter traverses the structure to evaluate sentences. This pattern is often used for programming languages, expression evaluation, and domain-specific languages (DSLs). It works best when the grammar is simple and does not require frequent changes.

[Java example](src/main/java/com/example/patterns/behavioral/interpreter/)

### 4. Iterator
The Iterator pattern provides a way to access the elements of a collection or aggregate object sequentially without exposing the underlying implementation. It defines an interface for traversing a collection, so that different types of collections can be iterated in a uniform manner. This pattern enhances flexibility and decouples the client from the collection's internal structure, allowing the same interface to be used across different types of collections.

[Java example](src/main/java/com/example/patterns/behavioral/iterator/)

### 5. Mediator
The Mediator pattern centralizes complex communication and control logic between related objects, reducing the direct dependencies between them. Instead of having objects reference each other directly, they communicate through a mediator object, which coordinates their interactions. This pattern promotes loose coupling, making the system easier to maintain and extend. It is especially useful in systems with multiple classes that need to collaborate in complex ways.

[Java example](src/main/java/com/example/patterns/behavioral/mediator/)

### 6. Memento
The Memento pattern provides the ability to capture and save an object’s current state without violating its encapsulation. This allows the state to be restored at a later time. It is commonly used for implementing undo/redo functionality, checkpointing, or rollback operations. The Memento pattern separates the object's internal state from external manipulation, ensuring that only the object itself can modify its internal state.

[Java example](src/main/java/com/example/patterns/behavioral/memento/)

### 7. Observer
The Observer pattern defines a one-to-many relationship between objects, where a subject notifies multiple observers of any state changes. This promotes a loosely coupled interaction where the subject only knows about the observers' interfaces, not their specific implementations. The pattern is commonly used in event-driven systems, such as UI frameworks, where the state of one component needs to automatically update other dependent components.

[Java example](src/main/java/com/example/patterns/behavioral/observer/)

### 8. Specification
The Specification pattern allows for the creation of combinable, reusable business rules that can be applied to objects. It defines a criteria that can be checked against objects to see if they satisfy the given condition. Specifications can be chained together using logical operations (AND, OR, NOT), allowing for complex filtering and selection logic without hardcoding rules into the objects themselves. This pattern is often used in validation, querying, and filtering logic.

[Java example](src/main/java/com/example/patterns/behavioral/specification/)

### 9. State
The State pattern allows an object to alter its behavior when its internal state changes. Instead of using conditionals to handle different states, the object delegates state-specific behavior to separate state objects. This makes the system more flexible and easier to extend, as new states can be added without modifying the existing code. It is typically used in state machines, workflow engines, and UI components that change behavior based on user actions or inputs.

[Java example](src/main/java/com/example/patterns/behavioral/state/)


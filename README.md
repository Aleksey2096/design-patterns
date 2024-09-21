<a name="readme-top"></a>

# Software design pattern in Java & Python

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ul>
    <li><a href="#behavioral-patterns">Behavioral patterns</a></li>
    <li><a href="#creational-patterns">Creational patterns</a></li>
    <li><a href="#structural-patterns">Structural patterns</a></li>
  </ul>
</details>

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

### 10. Strategy
The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. The algorithm can vary independently from the client that uses it. This pattern promotes the Open/Closed Principle, as new strategies can be introduced without changing the context in which they are used. It's commonly applied in sorting algorithms, data compression, and payment processing systems.

[Java example](src/main/java/com/example/patterns/behavioral/strategy/)

### 11. Template Method
The Template Method pattern defines the skeleton of an algorithm in a base class but allows subclasses to override specific steps of the algorithm without changing its structure. This promotes code reuse while providing flexibility for subclasses to adapt behavior. It is often used in scenarios where multiple classes share common behavior but differ in specific details, such as in frameworks, code generation, or workflow processes.

[Java example](src/main/java/com/example/patterns/behavioral/template_method/)

### 12. Visitor
The Visitor pattern allows adding new operations to a class hierarchy without changing the classes themselves. It separates the logic of the operation from the objects on which it operates, by having a visitor object visit each element of the hierarchy and perform the appropriate action. This pattern is useful when operations need to be performed on many different kinds of objects that form a complex structure, such as in compiler design, object traversal, and rendering engines.

[Java example](src/main/java/com/example/patterns/behavioral/visitor/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Creational patterns

### 1. Abstract Factory
The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. This pattern allows clients to work with object families in a consistent way by relying on abstract interfaces rather than concrete implementations. It is commonly used when systems need to support multiple types of objects that are interrelated, such as creating UI components for different platforms (e.g., Windows, macOS, Linux) without modifying the client code.

[Java example](src/main/java/com/example/patterns/creational/abstract_factory/)

### 2. Builder
The Builder pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations. This pattern is useful when creating an object that requires multiple steps or configurations, and when you want to hide the construction logic from the client. By using a builder, objects can be constructed incrementally and remain immutable or consistent. It is often applied when building products such as complex UI components or assembling data structures like JSON/XML objects.

[Java example](src/main/java/com/example/patterns/creational/builder/) (This directory contains two examples. One of them, Form.java, demonstrates the Builder pattern, featuring a static class within a parent class.)

### 3. Factory Method
The Factory Method pattern defines an interface for creating objects but allows subclasses to alter the type of objects that will be created. Instead of directly instantiating a class, clients rely on a factory method to create the objects, promoting loose coupling between the code that uses the objects and the actual object classes. This pattern is useful when the client does not need to know the specific class being instantiated, such as in plugin systems or class loaders.

[Java example](src/main/java/com/example/patterns/creational/factory_method/)

### 4. Prototype
The Prototype pattern allows an object to create a copy of itself, enabling the creation of new objects by cloning an existing object, rather than instantiating new objects from scratch. This pattern is particularly useful when object creation is expensive or complex and you want to avoid redundant initialization. Prototypes can maintain their own internal states and be duplicated with minimal overhead. It is commonly used in systems that need to generate many similar objects, like in game development or document editors.

[Java example](src/main/java/com/example/patterns/creational/prototype/)

### 5. Singleton
The Singleton pattern ensures that a class has only one instance and provides a global point of access to it. This pattern is useful in scenarios where exactly one object is needed to coordinate actions across the system, such as database connection pools, configuration managers, or logging services. By restricting the instantiation of a class, the Singleton pattern ensures that there is a single, shared instance throughout the application's lifetime, preventing resource conflicts and ensuring centralized control.

[Java example](src/main/java/com/example/patterns/creational/singleton/) (This directory contains six different examples of the Singleton pattern implemented in Java.)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Structural patterns

### 1. Adapter
The Adapter pattern allows objects with incompatible interfaces to work together by creating an intermediary that adapts one interface to another. It acts as a wrapper, converting the interface of a class into another interface that a client expects. This pattern is useful when integrating existing classes with a new system, or when using third-party libraries that don’t match your desired interface. It's commonly seen in legacy code integration and APIs.

[Java example](src/main/java/com/example/patterns/structural/adapter/)

### 2. Bridge
The Bridge pattern decouples an abstraction from its implementation, allowing them to vary independently. By using this pattern, you can separate the interface (abstraction) from the actual implementation, and both can evolve separately without affecting each other. This is useful in scenarios where an object needs to have multiple variations of its implementation, such as supporting multiple platforms or devices. It is commonly used in UI toolkits and device driver implementations.

[Java example](src/main/java/com/example/patterns/structural/bridge/)

### 3. Composite
The Composite pattern allows individual objects and groups of objects to be treated uniformly. It organizes objects into tree structures to represent part-whole hierarchies. This pattern is particularly useful when individual objects and compositions of objects need to be accessed in a consistent manner. The client can interact with both simple and complex objects through the same interface. Commonly used in file systems, graphical user interfaces (GUIs), and document processing systems.

[Java example 1](src/main/java/com/example/patterns/structural/composite/example1/) (HTML tag example)

[Java example 2](src/main/java/com/example/patterns/structural/composite/example2/) (This example shows how to create complex graphical shapes, composed of simpler shapes and treat both of them uniformly.)

### 4. Decorator
The Decorator pattern allows behavior to be added to individual objects dynamically without affecting other objects from the same class. This is done by wrapping an object with a decorator class that adds the new functionality. It provides an alternative to subclassing for extending functionality. Decorators are often used in scenarios where classes need to be extended in various ways, such as adding functionality to UI elements or enhancing core services in a flexible manner.

[Java example](src/main/java/com/example/patterns/structural/decorator/) (This example shows how you can adjust the behavior of an object without changing its code. Initially, the business logic class could only read and write data in plain text. Then we created several small wrapper classes that add new behavior after executing standard operations in a wrapped object. The first wrapper encrypts and decrypts data, and the second one compresses and extracts data. You can even combine these wrappers by wrapping one decorator with another.)

### 5. Facade
The Facade pattern provides a simplified interface to a complex system of classes, libraries, or subsystems. It hides the complexity of the system and offers a more straightforward interface to the client, making the system easier to use. This pattern is useful when dealing with large, complex APIs or systems that the client does not need to fully understand. It's commonly applied in frameworks, software libraries, and complex service layers.

[Java example](src/main/java/com/example/patterns/structural/facade/)

### 6. Flyweight
The Flyweight pattern minimizes memory usage by sharing as much data as possible with similar objects. It is especially useful when a large number of similar objects are created, as it reduces memory consumption by storing common properties externally and only keeping the unique parts within the objects. This pattern is commonly used in scenarios involving large datasets, like text editors, 3D modeling systems, and game development, where a large number of objects need to be managed efficiently.

[Java example](src/main/java/com/example/patterns/structural/flyweight/)

### 7. Proxy
The Proxy pattern provides a placeholder or surrogate for another object to control access to it. It acts as an intermediary that controls the creation, use, or behavior of the object it represents. Proxies are often used for lazy initialization, access control, logging, or remote service invocation. Common use cases include virtual proxies that delay object creation, protection proxies that manage access control, and remote proxies that represent objects over a network (e.g., in distributed systems).

[Java example](src/main/java/com/example/patterns/structural/proxy/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

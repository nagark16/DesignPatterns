# DesignPatterns
Practicing design patterns

### Creational Patterns
* Often, designs start out using Factory Method (less complicated, more customizable via subclasses) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, but more complex) as the designer discovers where more flexibility is needed
* Abstract Factory, Builder and Prototype can be implemented as Singletons.
* Builder focuses on constructing a complex object step by step. Abstract Factory creates families of product objects (either simple or complex). Builder returns the product as a final step, but the Abstract Factory returns the result immediately.

###### Factory Method
* Factory Method can be used along with the Iterator pattern to let collection subclasses return proper iterators
* Prototype doesn't require subclassing, but it does require an "initialize" operation. Factory Method requires subclassing, but doesn't require initialization step
* Factory Method is a specialization of Template Method. On the other hand, Factory Methods often serve as a step in a large Template Method

###### Abstract Factory Method
* Abstract Factory classes are often implemented with Factory Methods, but they can also be implemented using Prototype
* Abstract Factory can be used as an alternative to Facade to hide platform-specific classes
* Abstract Factory can be used along with a Bridge pattern. It's useful when the "interface" part of the Bridge can work only with a particular "implementation". In this case, factory can encapsulate these relations and hide the complexity from a client.

###### Builder
* Builder can be structured as a Bridge pattern
* Builder methods often support chaining

###### Singleton
* Facade can be transformed into Singleton since most of the time single facade object is sufficient
* Flyweight looks almost like Singleton in cases where it's possible to reduce everything to just one flyweight object. But remember, there are two fundamental differences between these patterns:
	1. Singleton object can be mutable. Flyweight objects are immutable.
	2. There should be only one Singleton instance, whereas Flyweight class can have multiple instances with a different intrinsic state

###### Prototype
* Lets you produce new objects by copying existing ones without compromising their internals.
* Prototype can be the simpler alternative to the Memento, if the object, which state you want to store in history, is fairly straightforward, doesn't have links to external resources, or if the links are easy to re-establish
* Designs that make heavy use of the Composite and Decorator patterns often can benefit from Prototype as well. It would allow to clone complex structures, instead of re-constructing them from scratch
* Prototype can help when you need to save copy of the Command into history
* The Prototype pattern allows creating a set of prototype objects that represent all possible configurations of an object. Then, instead of instantiating a subclass that matches some configuration, client code looks for the appropriate prototype and clones it.
* The Prototype pattern provides a client an interface to work with all prototypes. This interface is common for all objects that support cloning. It makes client code independent from concrete classes of products that it clones


### Structural Patterns
* Bridge is designed up-front to let the abstraction and the implementation vary independently. Adapter is retrofitted to make unrelated classes work together. Adapter makes things work after they're designed; Bridge makes them work before they are.
* Adapter provides a different interface to its subject. Proxy provides the same interface. Decorator provides an enhanced interface
* Adapter is meant to change the interface of an existing object. Decorator enhances another object without changing its interface. Decorator is thus more transparent to the application than an adapter is. As a consequence, Decorator supports recursive composition, which isn't possible with pure Adapters.
* Facade defines a new interface, whereas Adapter reuses an old interface. Remember that Adapter makes two existing interfaces work together as opposed to defining an entirely new one.
* State, Strategy, Bridge (and to some degree Adapter) have similar solution structures. They all share elements of the "handle/body" idiom. They differ in intent - that is, they solve different problems.

###### Adapter
* Allows objects with incompatible interfaces to collaborate
* When you want to reuse existing class, but its interface is not compatible with the rest of application's code. The Adapter pattern creates a middle layer class that translates application calls to the form that the existing class understands.
* You need to reuse several existing classes, but they lack some common functionality. And you can not add it to the superclass because it is either closed or used in other code. You could put the missing functionality into a new adapter class. It will connect your app's code and the classes you are interested in. This solution looks very similar to the Visitor pattern.

###### Bridge
* Lets you split a giant class or a set of closely related classes into two separate hierarchies, abstraction and implementation, which can be developed independently of each other.
* When you have a huge class that has several variants of some functionality (for example, works with different database servers). The class becomes hard to support because anyone who touches it has to spend a lot of time trying to comprehend it fully. Changes to one of the functionality variant result in editing the whole class, which may introduce nasty overlooked bugs. The Bridge pattern splits the monolithic class into several class hierarchies, one of which references the other ones. Classes in these hierarchies can be edited independently from the other ones. It simplifies the support and minimizes a risk of breaking existing code.
* When you need to extend a class in several orthogonal (independent) dimensions. Instead of growing a single hierarchy, Bridge pattern suggests to create a separate class hierarchy for each dimension and link these hierarchies with a reference field.
* When you need to be able to change implementation at runtime. Although it is optional, Bridge pattern allows changing the implementation object inside the abstraction. That is as easy as assigning a new value to a field.
* Builder can be structured as a Bridge pattern: Director will act as interface, and Builders will play the role of implementations.
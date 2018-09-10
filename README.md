# DesignPatterns
Practicing design patterns

#### Creational Patterns
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

###### Singleton
* Facade can be transformed into Singleton since most of the time single facade object is sufficient
* Flyweight looks almost like Singleton in cases where it's possible to reduce everything to just one flyweight object. But remember, there are two fundamental differences between these patterns:
	1. Singleton object can be mutable. Flyweight objects are immutable.
	2. There should be only one Singleton instance, whereas Flyweight class can have multiple instances with a different intrinsic state
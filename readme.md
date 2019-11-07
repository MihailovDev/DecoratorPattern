# Decorator Pattern

The decorator pattern attaches additional responsibilities to objects dynamically. 
Decorators provide a flexible alternative to subclassing for extending functionality.
When using subclassing, different subclasses extend a class in different ways. But an extension is
bound to the class at compile time and cannot be changed dynamically.

This pattern allows to add or remove responsibilities  from an object at run-time.
This design also allows for multiple decorators can be stacked on top of each other, and each time a 
new functionality is added to the overridden methods. For the main component we can use an interface 
or use inheritance. 



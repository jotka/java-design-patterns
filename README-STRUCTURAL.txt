Adapter
-------
Convert the interface of a class into another interface clients expect.
Adapter lets classes work together, that could not otherwise because of incompatible interfaces.

Adapter is used when you have an abstract interface, and you want to map that interface to another object
which has similar functional role, but a different interface.


Bridge
------
Compose objects into tree structures to represent part-whole hierarchies.
 is very similar to Adapter, but we call it Bridge when you define both the abstract interface
 and the underlying implementation.
 I.e. you're not adapting to some legacy or third-party code, you're the designer of all the code
 but you need to be able to swap out different implementations.

Composite
---------
Compose objects into tree structures to represent part-whole hierarchies. 
/ Composite lets clients treat individual objects and 
compositions of objects uniformly.


Decorator
---------
Add additional responsibilities dynamically to an object.
This is used when you want to add functionality to an object,
but not by extending that object's type. This allows you to do so at runtime.


Flyweight
---------
use sharing to support a large number of objects 
that have part of their internal state in common 
where the other part of state can vary.


Memento
-------
capture the internal state of an object without violating encapsulation and 
thus providing a mean for restoring the object into initial state when needed.


Proxy
-----
provide a “Placeholder” for an object to control references to it.
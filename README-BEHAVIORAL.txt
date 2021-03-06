Chain of Responsibiliy
----------------------
 - It avoids attaching the sender of a request to its receiver, 
 giving this way other objects the possibility of handling the request too.
- The objects become parts of a chain and the request is sent 
from one object to another across the chain until one of the objects will handle it.


Command
-------
Encapsulate a request in an object, 
Allows the parametrization of clients with different requests and
Allows saving the requests in a queue.


Interpreter
-----------
Given a language, 
define a representation for its grammar along with an interpreter 
that uses the representation to interpret 
sentences in the language / Map a domain to a language, 
the language to a grammar, 
and the grammar to a hierarchical object-oriented design


Iterator
--------
Provide a way to access the elements of an aggregate object sequentially 
without exposing its underlying representation.


Mediator
--------
Define an object that encapsulates how a set of objects interact. 
Mediator promotes loose coupling by keeping objects 
from referring to each other explicitly, 
and it lets you vary their interaction independently.


Observer
--------
Define a one-to-many dependency between objects so that 
when one object changes state, 
all its dependents are notified and updated automatically.


Strategy
--------
Define a family of algorithms,
encapsulate each one, 
and make them interchangeable. 
Strategy lets the algorithm vary independently from clients that use it.
 

Template Method
---------------
Define the skeleton of an algorithm in an operation, 
deferring some steps to subclasses / Template Method 
lets subclasses redefine certain steps of an algorithm 
without letting them to change the algorithm's structure.


Visitor
-------
Represents an operation to be performed on the elements of an object 
structure / Visitor lets you define a new operation 
without changing the classes of the elements on which it operates.


Null Object
-----------
Provide an object as a surrogate for the lack of an object of a given type.
/ The Null Object Pattern provides intelligent do nothing behavior, 
hiding the details from its collaborators.
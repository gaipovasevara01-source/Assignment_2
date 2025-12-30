Project Overview

This project implements a Vehicle Management System using object-oriented programming principles. 

It demonstrates inheritance through a vehicle hierarchy, abstraction using an abstract superclass, and composition and aggregation through driver-vehicle relationships.

Class Hierarchy

Vehicle is an abstract superclass defining common fields and behavior.

Car, Motorcycle, and Truck extend Vehicle and override engine behavior.

Driver is associated with vehicles using composition and aggregation.

Protected access allows subclasses to reuse data while maintaining encapsulation.

Compile & Run

javac *.java

java Main

Reflection

Inheritance simplified the system design by allowing shared vehicle attributes and behaviors to be defined once in the abstract Vehicle class. 

Method overriding enabled each subclass to customize engine behavior without duplicating structure.

One challenge was deciding when to use protected versus private access modifiers. 

Using protected fields allowed subclasses to access shared data safely while still maintaining encapsulation from external classes.

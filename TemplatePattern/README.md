A Template Pattern says that "just define the skeleton of a function in an operation, deferring some steps to its subclasses".

Creates a group of subclasses that have to execute a similar group of methods.

An abstract class is created that contains the template method.(In the above example Sandwich is the abstract class)

A template method consists of a series of method calls that every subclass will call.(In the above example makeSandwich() is the template method)

ConcreteClass implements all the operations required by the templateMethod that were defined as abstract in the parent class and can also override the already implemented methods. There can be many different ConcreteClasses.(VegSandwich and NonVegSandwich are the concrete classes implementing the abstract methods and overridding the necessary method to define its functionality)


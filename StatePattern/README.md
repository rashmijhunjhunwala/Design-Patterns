State design pattern is used when an Object changes its behavior based on its internal state.

Context: It maintains references to concrete state objects which may use to define the current state of the object.

State: Defines interface to for declaring what each concrete state should do.

Concrete State: Provides implementation for methods defined in the State.

Therefore,  we create objects which represent various states and a context object whose behavior varies as its state object changes.

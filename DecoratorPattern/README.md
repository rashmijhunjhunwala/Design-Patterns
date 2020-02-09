A Decorator Pattern says that just "attach a flexible additional responsibilities to an object dynamically and without altering its structure".

Decorators(Mozarella and Mushroom) have the same super type(Pizza) as the object they decorate(PlainPizza).

You can use multiple decorators(can be seen in the PizzaPlace class, we use multiple decorators for a particular pizza i.e mushroom,mozarella) to wrap an object.

Since decorators have same type(all the decorators implement Pizza i.e are of type Pizza) as object, we can pass around decorated object instead of original.

We can decorate objects at runtime(As done in the PizzaPlace class).

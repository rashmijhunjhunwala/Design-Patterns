An Adapter Pattern "converts the interface of a class into another interface that a client wants".

Adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.

This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces.
A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. 
You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.
(In our example the EnemyRobotAdapter acts as the card reader thus is an adapter between the Robot and the client.As we plugin the target interface
which is the RobotAttacker into the EnemyRobotAdapter and the EnemyRobotAdapter into the client ,the client can now can read the RobotAttacker.)

In our example the client expects a EnemyAttacker type of object but the object RobotAttacker(adaptee) have the same features but exposing a different interface
thus,we use an adapter EnemyRobotAdapter(Adapter) to convert it into a EnemyAttacker interface the one client wants. 

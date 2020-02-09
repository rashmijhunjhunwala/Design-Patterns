A Command Pattern says that "encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command".

These are the following participants of the Command Design pattern:


Command: This is an interface for executing an operation.


ConcreteCommand: This class extends the Command interface and implements the execute method. 
This class creates a binding between the action and the receiver.(VolumeUp for instance is a Concrete command taking our example in consideration)


Client: This class creates the ConcreteCommand class and associates it with the receiver.(The PlayWithRemote class in our example is the client)


Invoker: This class asks the command to carry out the request.(DeviceButton class in our example is the invoker)


Receiver: This class knows to perform the operation.(The electronic devices such as the TV and the Radio are the recievers.)

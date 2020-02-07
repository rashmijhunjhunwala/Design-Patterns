In this pattern, normally each receiver contains reference to another receiver.Thus,this pattern creates a chain of reciever objects for a request.

Now, a request from the client is passed on to the chain of objects to proccess it.

The objects in the chain will decide themselves who is suitable for processing the request and whether the request is required to be sent to the next object in the chain or not.

It allows a set of classes to act as one.

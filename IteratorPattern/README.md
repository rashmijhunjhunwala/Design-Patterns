There are a lot of data structures/collections available in every language.
Now,if you implementing more than one type of collection of objects in your program ,the way to traverse through each collection to get the objects sequentially is different , which makes us end up with a lot of duplicate code. 
Iterator pattern provides you with a uniform way to access different collections of objects .
If we have an Array,ArrayList and a HashTable of objects implementing a common interface, we pop out an iterator and treat them the same.
Thus it provides a uniform way to cycle through the different types of collections of objects.
Now we can iterate through the collections access the objects and its elements without having to expose its implementation.
According to GoF, Iterator Pattern is used "to access the elements of an aggregate object sequentially without exposing its underlying implementation".

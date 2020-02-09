Composite pattern is used where we need to treat a group of objects in similar way as a single object

In object-oriented programming, a composite is an object designed as a composition of one-or-more similar objects, all exhibiting similar functionality. 

The intent of a composite is to “compose” objects into tree structures.

When dealing with Tree-structured data, programmers often have to discriminate between a leaf-node and a branch.This makes code more complex, and therefore, error prone. The solution is an abstract class that allows treating complex and primitive objects uniformly.

The key concept is that you can manipulate a single instance of the object just as you would manipulate a group of them.

The Composite Pattern has four participants:

Component – Component declares the interface for objects in the composition and for accessing and managing its child components. It also implements default behavior for the interface common to all classes as appropriate.
(In our example SongComponent class is the Component.)

Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.(In our example Song class is the leaf class.)

Composite – Composite stores child components and implements child related operations in the component interface.(In our example SongGroup is the composite.We can have leaves(songs) inside the songGroup or composites(SongGroups inside the songGroup.)

Client – Client manipulates the objects in the composition through the component interface.(SongListGenerator is the Client in the above example.)

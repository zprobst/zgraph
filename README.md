# zgraph
zGraph is a simple graph modeling library. Not graphs like line charts... like nodes and vertices.
Don't use it yet unless you are daring, it is not complete yet.

# Explination of graphs
A graph is a collection of nodes or verticies that are joined by a collection of edges. 
Most programming people should probably know what they are. If not, https://en.wikipedia.org/wiki/Graph_(discrete_mathematics)#Mixed_graph

# Explination of Directednes and Weights.
For those that may not know, there are two big terms that can use to describe the kind of graphs that you would want.

Directedness: A graph is directed if an edge between two nodes is not explicitly allowed in the reverse. 
That means if there is an edge from A to B, the same edge does not let you travel back to A from B. Undirected graphs allow you to do that.

Weightedness: A weighted graph is where each edge has an associated cost. The exact meaing of the "cost" depends on context.

Regardless of what you may need, we have all possible combitatons.
Weighted, Directed
Weighted, Undirected
Unweighted, Directed,
Unweighted, Undirected

# What do trees have to do with this?
Trees are Unweighted Directed graphs without loops/cycles: https://en.wikipedia.org/wiki/Tree_(data_structure)
So we can apply all of the logic we have made and "rebrand" it a bit to be a tree.

# What do I do with trees and graphs?
Well other than having a fun Christmas with a math geek, you can do all kinds of other things.
Logistics, pathfinding, chemistry, physics, neuroscience, sociology, linguistics, and like everything else has something that can be abstracted as a graph.

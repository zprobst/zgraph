package zgraph.tree;

import zgraph.graph.UnweightedDirectedGraph;

/**
 * A tree, in most cases is simply a unweighted, directed graph with no loops.
 * This provides an implementaion of that with a wrapper for my familiar tree terms like "child" and the
 * like. Additionally, this class has options to run tree traversals.
 *
 * @param <T> The type of the data stored in the tree.
 */
public class Tree<T> extends UnweightedDirectedGraph<T> {

    /**
     * Creates a new instance of the graph with a starting capacity of elements.
     *
     * @param initialCapacity Starting capacity of the node array.
     */
    protected Tree(int initialCapacity) {
        super(initialCapacity);
    }
}
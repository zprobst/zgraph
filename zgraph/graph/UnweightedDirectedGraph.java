package zgraph.graph;

/**
 * This provides an implementation of a graph that has:
 *      Directed Edges: Edges between two nodes/verities are mutually exclusive; being able one way does not mean you
 *      can go the same way back to the previous node. An edge is meant only to go one way.
 *
 *      Unweighted Edges: Edges between two nodes/vertices do not have a weight/cost associated with them.
 *
 * @param <T> The type of data stored in the graph.
 */
public class UnweightedDirectedGraph<T> extends UnweightedGraph<T> {

    /**
     * Creates a new instance of the graph with a starting capacity of elements.
     *
     * @param initialCapacity Starting capacity of the node array.
     */
    public UnweightedDirectedGraph(int initialCapacity) {
        super(initialCapacity);
    }
}
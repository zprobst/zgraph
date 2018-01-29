package zgraph;

/**
 * This provides an implementation of a graph that has:
 *      Directed Edges: Edges between two nodes/verities are mutually exclusive; being able one way does not mean you
 *      can go the same way back to the previous node. An edge is meant only to go one way.
 *
 *      Weighted Edges: Edges between two nodes/vertices have a weight/cost associated with them.
 *
 * @param <T> The type of data stored in the graph.
 */
public class WeightedDirectedGraph<T> extends WeightedGraph<T> {
    /**
     * Creates a new instance of the graph with a starting capacity of elements.
     *
     * @param initialCapacity Starting capacity of the node array.
     */
    public WeightedDirectedGraph(int initialCapacity) {
        super(initialCapacity);
    }
}

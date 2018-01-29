package zgraph;

/**
 * This provides an implementation of a graph that has:
 *      Undirected Edges: Edges between two nodes/verities not are mutually exclusive; being able one way means you can
 *      go back the same way.
 *
 *      Unweighted Edges: Edges between two nodes/vertices do not have a weight/cost associated with them.
 *
 * @param <T> The type of data stored in the graph.
 */
public class UnweightedUndirectedGraph<T> extends UnweightedGraph<T> {
    /**
     * Creates a new instance of the graph with a starting capacity of elements.
     *
     * @param initialCapacity Starting capacity of the node array.
     */
    public UnweightedUndirectedGraph(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Creates a dual direction connection between two neighbors
     *
     * @param node        Node to get a neighbor
     * @param newNeighbor The neighbor to get.
     */
    @Override
    public void addNeighborToNode(Node<T> node, Node<T> newNeighbor) {
        super.addNeighborToNode(node, newNeighbor);
        newNeighbor.addNeighbor(node, 0);
    }
}
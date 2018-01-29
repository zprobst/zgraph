package zgraph;

public class WeightedUndirectedGraph<T> extends WeightedGraph<T> {
    /**
     * Creates a new instance of the graph with a starting capacity of elements.
     *
     * @param initialCapacity Starting capacity of the node array.
     */
    public WeightedUndirectedGraph(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Creates a single direction connection between
     *
     * @param node        Node to get a neighbor
     * @param newNeighbor The neighbor to get.
     * @param cost        The cost of the edge.
     */
    @Override
    public void addNeighborToNode(Node<T> node, Node<T> newNeighbor, int cost) {
        super.addNeighborToNode(node, newNeighbor, cost);
        newNeighbor.addNeighbor(node, cost);
    }
}

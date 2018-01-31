package zgraph.graph;

public abstract class UnweightedGraph<T> extends Graph<T> {
    /**
     * Creates a new instance of the graph with a starting capacity of elements.
     *
     * @param initialCapacity Starting capacity of the node array.
     */
    UnweightedGraph(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Creates a single direction connection between two nodes
     *
     * @param node Node to get a neighbor
     * @param newNeighbor The neighbor to get.
     */
    public void addNeighborToNode(Node<T> node, Node<T> newNeighbor){
        node.addNeighbor(newNeighbor, 0);
    }
}
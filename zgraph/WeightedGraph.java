package zgraph;


public abstract class WeightedGraph<T> extends Graph<T>{
    /**
     * Creates a new instance of the graph with a starting capacity of elements.
     *
     * @param initialCapacity Starting capacity of the node array.
     */
    WeightedGraph(int initialCapacity) {
        super(initialCapacity);
    }

    /**
     * Creates a single direction connection between
     *
     * @param node Node to get a neighbor
     * @param newNeighbor The neighbor to get.
     * @param cost The cost of the edge.
     */
    public void addNeighborToNode(Node<T> node, Node<T> newNeighbor, int cost){
        node.addNeighbor(newNeighbor, cost);
    }
}
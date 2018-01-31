package zgraph.graph;

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

    /**
     * Prim's algorithm is a greedy algorithm that finds the miniumum spanning tree of this kind of graph.
     * It finds the tree that connects all nodes (without cycles by definition of a tree) that has the minimum
     * edge cost. In order for this to work, the graphs have to be connected. That is, from any node, you have to be
     * able to get to every other node. If your graph is not connected, you have to use primsDisconnected()
     *
     */
    public void prims(){

    }

    /**
     * Prim's algorithm is a greedy algorithm that finds the miniumum spanning tree of this kind of graph.
     * It finds the tree that connects all nodes (without cycles by definition of a tree) that has the minimum
     * edge cost. In order for this to work, the graphs have to be connected.
     *
     * This particular implementation uses prim's multiple times to provide a forest of minimum spanning trees.
     */
    public void primsDisconnected(){

    }
}

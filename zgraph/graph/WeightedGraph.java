package zgraph.graph;

public abstract class WeightedGraph<T> extends Graph<T> {
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


    /**
     * Given a starting and ending location in the graph, performs dijkstra's algorithm to get from
     * start to end on the shortest(lowest cost) path.
     *
     * @param start Start location of the path-find.
     * @param end End location of the path-find.
     * @return A path from start to end (including bot the start and end)
     */
    public Node[] dijkstraFromTo(Node<T> start, Node<T> end){
        return null;
    }

    /**
     * Runs dijkstra's algorithm to provide a map of nodes from and the node by which is the shortest path to it.
     * This map has the property where given any arbitrary node, this map will be able to map back to a given
     * start node with the shortest path.
     */
    public void dijkstraMap(Node<T> start){

    }

    /**
     * This function runs the A* path-finding algorithm on the graph to provide the shortest path from
     * start to end location on the graph.
     *
     * @param start Start location of the path.
     * @param end End location of the path.
     * @param heuristic The heuristic algorithm for a* to use.
     * @return A path from start to end (including bot the start and end)
     */
    public Node[] aStarFromTo(Node<T> start, Node<T> end, AStarHeuristic<T> heuristic){
        return null;
    }

    /**
     * Finds the shortest path between two points with both positive and negative weights and without negative cycles.
     * The complete execution finds the shortest summed weights path between each possible pairs of nodes.
     */
    public void floydWarshall(){

    }

    /**
     * Finds the shortest path between two points with both positive and negative weights and without negative cycles.
     * The complete execution finds the shortest summed weights path between each possible pairs of nodes. From the
     * completed execution, the path for the specific nodes selected will be returned.
     *
     * @param start Start location of the path.
     * @param end End location of the path.
     * @return A path from start to end (including bot the start and end)
     */
    public Node[] floydWarshallFromTo(Node<T> start, Node<T> end){
        return null;
    }
}
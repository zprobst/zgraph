package zgraph.graph;

/**
 * Provides the abstract notion of a graph.
 *
 * @param <T> The type of data the graph is storing on the vertex.
 */
public abstract class Graph <T> {
    private static final float SCALE_FACTOR = 7f/3f;
    private int nodeCount;
    private Node[] nodes;

    /**
     * Creates a new instance of the graph with a starting capacity of elements.
     *
     * @param initialCapacity Starting capacity of the node array.
     */
    Graph(int initialCapacity){
        nodes = new Node[initialCapacity];
        nodeCount = 0;
    }

    /**
     * Get the total number of nodes in the graph.
     *
     * @return The total number of registered nodes in the graph as an int.
     */
    public int getNodeCount(){
        return nodeCount;
    }

    /**
     * Checks to see if a specific node is in the graph.
     *
     * @param node Node to search for.
     * @return True if the node is in the graph; false otherwise.
     */
    public boolean isInGraph(Node<T> node){
        for (int i = 0; i < nodeCount; i++) {
            if(node == nodes[i]){
                return true;
            }
        }

        return false;
    }

    /**
     * Checks to see if a particular data element is in the graph.
     *
     * @param data Data to search for.
     * @return True if the data is in one of the nodes, false otherwise.
     */
    public boolean isInGraph(T data){
        for (int i = 0; i < nodeCount; i++) {
            if(data == nodes[i].getData()){
                return true;
            }
        }

        return false;
    }

    /**
     * Creates a new node in the graph for the provided data.
     *
     * @param data Data to create node around.
     * @return The new node from the graph.
     */
    public Node<T> addNode(T data){
        //Rescale the array if we are out of room.
        if(nodeCount == nodes.length){
            rescale();
        }

        //Create the new node and put it in the array, returning the new element.
        Node<T> node = new Node<>(data);
        nodes[nodeCount] = node;
        nodeCount++;
        return node;
    }

    /**
     * Creates re-scaled arrays for the graph.
     */
    private void rescale(){
        Node[] newNodes= new Node[(int)(nodes.length * SCALE_FACTOR)];

        for (int i = 0; i < nodeCount; i++) {
            newNodes[i] = nodes[i];
        }

        nodes = newNodes;
    }

    public void bfs(){

    }

    public void dfs(){

    }
}

package zgraph;

/**
 * Provides the abstract notion of a graph.
 *
 * @param <T> The type of data the graph is storing on the vertex.
 */
public abstract class Graph <T>{
    private static final float SCALE_FACTOR = 5f/3f;
    private int nodeCount;
    private Node<T>[] vertices;

    /**
     * Creates a new instance of the graph with a starting capacity of elements.
     *
     * @param initialCapacity Starting capacity of the node array.
     */
    protected Graph(int initialCapacity){
        vertices = (Node<T>[]) new Object[initialCapacity];
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
            if(node == vertices[i]){
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
            if(data == vertices[i].getData()){
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
        if(nodeCount == vertices.length){
            rescale();
        }

        //Create the new node and put it in the array, returning the new element.
        Node<T> node = new Node<>(data);
        vertices[nodeCount] = node;
        nodeCount++;
        return node;
    }

    /**
     * Creates re-scaled arrays for the graph.
     */
    private void rescale(){
        Node<T>[] newNodes= (Node<T>[]) new Object[(int)(vertices.length * SCALE_FACTOR)];

        for (int i = 0; i < nodeCount; i++) {
            newNodes[i] = vertices[i];
        }

        vertices = newNodes;
    }
}

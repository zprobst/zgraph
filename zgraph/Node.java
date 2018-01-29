package zgraph;

/**
 * Creates a new instance of the node class that stored a vertex/node of a graph/tree.
 *
 * @param <T> Type of data to store in the node.
 */
public class Node <T>{
    private static final float SCALE_FACTOR = 5f/3f;
    
    private int neighborCount;
    private T data;
    private Node<T>[] neighbors;
    private float[] edgeWeights;

    /**
     * Creates a new node with a certain piece of data.
     *
     * @param data The data of the object.
     */
    Node(T data){
        this(data, 3);
    }

    /**
     * Creates a new node with a certain piece of data and initial capacity of neighbors.
     *
     * @param data Data of the object.
     * @param nCapacity The capacity of the object.
     */
    Node(T data, int nCapacity){
        this.data = data;
        neighbors = (Node<T>[]) new Object[nCapacity];
        edgeWeights = new float[nCapacity];
    }

    /**
     * Get the neighbor count of this node.
     *
     * @return The number of neighbors this node has in terms of the amount of nodes this node has connected out of it.
     */
    public int getNeighborCount(){
        return neighborCount;
    }

    /**
     * Get the data stored at this node.
     *
     * @return The data stored in this node.
     */
    public T getData(){
        return data;
    }

    /**
     * Adds a new node as a neighbor of this node.
     *
     * @param newNeighbor New neighbor of this node.
     * @param cost Cost to travel from this node to the neighbor.
     * @return true of the node was added as a neighbor, false otherwise.
     */
    boolean addNeighbor(Node<T> newNeighbor, float cost){
        if(hasNeighbor(newNeighbor)){
            return false;
        }
        
        if(neighborCount == neighbors.length){
            rescale();
        }
        
        neighbors[neighborCount] = newNeighbor;
        edgeWeights[neighborCount] = cost;
        neighborCount++;
        return true;
    }

    /**
     * Checks whether or not this node instance is connected to the supplied node.
     *
     * @param possibleNeighbor Possible neighbor
     * @return True if neighbors; false otherwise.
     */
    public boolean hasNeighbor(Node<T> possibleNeighbor) {
        for (int i = 0; i < neighborCount; i++) {
            if(neighbors[i] == possibleNeighbor){
                return true;
            }
        }

        return false;
    }

    /**
     * Rescales the arrays to provide storage for more neighbors.
     */
    private void rescale(){
        Node<T>[] newNeighbors = (Node<T>[]) new Object[(int)(neighbors.length * SCALE_FACTOR)];
        float[] newEdgeWeights = new float[(int)(edgeWeights.length * SCALE_FACTOR)];

        for (int i = 0; i < neighborCount; i++) {
            newNeighbors[i] = neighbors[i];
            newEdgeWeights[i] = edgeWeights[i];
        }

        neighbors = newNeighbors;
        edgeWeights = newEdgeWeights;
    }
}
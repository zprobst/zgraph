package zgraph.heap;

/**
 * The IHeap interface provides a deafault interface with which to interface with a heap priority queue.
 *
 * @param <E> A generic type of elements that will be stored in the heap.
 */
public interface IHeap<E>{
    /**
     * The top of the heap. The min value of the whole heap.
     *
     * @return The top element of the heap.
     */
    E top();

    /**
     * Removes the top element from the heap and returns it.
     *
     * @return The top element of the heap.
     */
    E removeTop();

    /**
     * Inserts a new item into the heap.
     *
     * @param item The new item to be added to the heap.
     * @return True if the item was correctly added; false if it could not be added.
     */
    boolean insert(E item);

    /**
     * Returns whether or not the heap is full.
     *
     * @return True if the heap is true; false otherwise.
     */
    boolean isFull();

    /**
     * Returns whether or not the heap is empty.
     *
     * @return True if the heap is empty; false otherwise.
     */
    boolean isEmpty();

    /**
     * Gives the number of elements in the heap.
     *
     * @return The number of elements in the heap.
     */
    int size();
}

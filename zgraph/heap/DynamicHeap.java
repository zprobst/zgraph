package zgraph.heap;

public class DynamicHeap<E extends Comparable<? super E>> extends Heap<E>{
    private float scaleFactor;
    private static final float DEFAULT_SCALE_FACTOR = 7f/3f;

    public DynamicHeap(int startingCapacity, float scaleFactor) {
        super(startingCapacity);
        this.scaleFactor = scaleFactor;
    }

    public DynamicHeap(E[] items) {
        this(items, items.length);
    }

    public DynamicHeap(E[] items, int heapCapacity) {
        super(items, heapCapacity);
        scaleFactor = DEFAULT_SCALE_FACTOR;
    }

    /**
     * Ensures there is room in the heap for the element and inserts it into the array.
     *
     * @param item The item to add to the heap.
     * @return True if the item could be added; false otherwise.
     */
    @Override
    public boolean insert(E item) {
        if(isFull()){
            rescale();
        }

        return super.insert(item);
    }

    /**
     * Rescales the heap array by a scale factor to provide a greater size of the array.
     */
    protected void rescale(){
        E[] newHeapArray = createGenericArray( (int) (capacity * scaleFactor));

        for (int i = 1; i <= size; i++){
            newHeapArray[i] = heap[i];
        }

        heap = newHeapArray;
    }
}

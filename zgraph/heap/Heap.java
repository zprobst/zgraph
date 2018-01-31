package zgraph.heap;

public class Heap<E extends Comparable<? super E>> implements IHeap<E> {
    protected E[] heap;
    protected int size;
    protected int capacity;

    public Heap(int capacity){
        this.heap = createGenericArray(capacity + 1);
        this.capacity = capacity;
        this.size = 0;
    }

    public Heap(E[] items)
    {
        this(items, items.length);
    }

    public Heap(E[] items, int heapCapacity)
    {
        this(heapCapacity);

        //We are going to copy the items over to the new array. That way the user can still use the old array.
        for(int i = 0; i < items.length; i++)
        {
            //Make sure the element isn't null.
            if(items[i] == null) {
                //TODO: Throw an error. We cannot have null elements.
            }

            //Copy the item into the heap.
            heap[i+1] = items[i];
            size++;
        }

        buildHeap();
    }

    protected void heapify(int index){
        //Caches some index values.
        int smallestIndex = index;
        int leftChildIndex = 2 * index;
        int rightChildIndex = leftChildIndex + 1;

        //Check if either the left or right child is smaller than the parent.
        if(leftChildIndex <= size && heap[leftChildIndex].compareTo(heap[index]) < 0){
            smallestIndex = 2 * index;
        }
        if(rightChildIndex <= size && heap[rightChildIndex].compareTo(heap[smallestIndex]) < 0){
            smallestIndex = rightChildIndex;
        }

        //If we don't wind up with a swap that needs to happen, then we know that we can
        //stop heapify-ing. if not, we need to preform the swap and heap-ify again on the smallest value.
        if(smallestIndex != index){
            E temp = heap[index];
            heap[index] = heap[smallestIndex];
            heap[smallestIndex] = temp;
            heapify(smallestIndex);
        }
    }

    protected void buildHeap(){
        for (int i = size / 2; i > 0; i--) {
            heapify(i);
        }
    }

    protected E[] createGenericArray(int size){
        return (E[]) new Comparable[size];
    }

    @Override
    public E top() {
        if (size == 0){
            //TODO: Throw an error. We cannot have null elements.
        }

        return heap[1];
    }

    @Override
    public E removeTop() {
        //Grab a copy of the top of the heap/
        E top = top();

        //Set the root of the tree as an arbitrary element.
        heap[1] = heap[size];
        size--;

        //Re-heapify the element.
        heapify(1);

        //Return the top of the array.
        return top;
    }

    @Override
    public boolean insert(E item) {
        //Check if the element is a valid element.
        //In this case, we cannot order null.
        if(item == null){
            return false;
        }

        //Make sure we have room.
        if(isFull()){
            return false;
        }

        //At this point, we both have room and have the ability to order the element.
        //Therefore, we can add it to the heap at this point.
        size++;
        heap[size] = item;

        //Start the position at the end of the heap and recursively applies the heap
        //property to the subtree that starts at the location where we put the element
        //and continues until we reach the root and/or the heap condition has been met.
        int position = size;

        while(
            position != 1 &&
            heap[position].compareTo(heap[position/2]) < 0){

            E temp = heap[position/2];
            heap[position/2] = heap[position];
            heap[position] = temp;
            position /= 2;
        }

        //We have successfully completed the insert at this point, so we can single a success.
        return true;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public static <T extends Comparable<? super T>> T[] heapSort(T[] elements){
        Heap<T> heap = new Heap<>(elements);

        for (int i = heap.size; i >= 2; i--) {
            T temp = heap.heap[i];
            heap.heap[i] = heap.heap[1];
            heap.heap[1] = temp;
            heap.size--;
            heap.heapify(1);
        }

        return heap.heap;
    }
}

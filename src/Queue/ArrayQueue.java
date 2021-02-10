package Queue;
//Array based Queue Implementation
public class ArrayQueue<E> implements Queue<E> {
    public static final int CAPACITY = 1000;


    private E[] data;

    private int firstIndex = 0;
    private int tot_no_queue = 0;

    public ArrayQueue(){
        this(CAPACITY);
    }

    public ArrayQueue(int capacity){
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return tot_no_queue;
    }

    @Override
    public boolean isEmpty() {
        return tot_no_queue==0;
    }

    @Override
    public void enqueue(E e) throws IllegalStateException {
        if(tot_no_queue == data.length)
            throw new IllegalStateException("Size is full");
        int avail = (firstIndex + tot_no_queue)%data.length;
        data[avail] = e;
        tot_no_queue++;
    }

    @Override
    public E first() {
        if(isEmpty()) return null;
        return data[firstIndex];
    }

    @Override
    public E dequeue() {
        if(isEmpty()) return null;

        E answer = data[firstIndex];
        data[firstIndex] =null;
        firstIndex = (firstIndex + 1)% data.length;
        tot_no_queue--;
        return answer;
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(10);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(4);

        arrayQueue.first();
        arrayQueue.isEmpty();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();



    }
}

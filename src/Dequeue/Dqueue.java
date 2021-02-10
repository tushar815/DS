package Dequeue;

public interface Dqueue<E> {

    int size();

    boolean isEmpty();

    E first();

    E last();

    void addFirst(E e);

    void addLast(E e);

    E removeFirst();

    E removeLast();

}

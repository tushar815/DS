package Stack;

import LinkedList.SinglyLinkedList;

// implement by using existing linkedList



public class StackOnList<E> {

    private SinglyLinkedList<E> singlyLinkedList = new SinglyLinkedList<>();
    public StackOnList(){

    }
    public int size(){
        return singlyLinkedList.getSize();
    }

    public boolean isEmpty(){
        return singlyLinkedList.isEmpty();
    }

    public void push(E e){
        singlyLinkedList.addFirst(e);
    }
    public E top(){
        return singlyLinkedList.first();
    }
    public E pop(){
        return singlyLinkedList.removeFirst();
    }




}

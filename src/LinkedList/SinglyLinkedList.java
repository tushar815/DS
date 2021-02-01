package LinkedList;

public class SinglyLinkedList<E> {

    private static class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement(){
            return element;
        }

        public Node<E> getNext(){
            return next;
        }

        public void setNext(Node<E> n){
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;

    private int size = 0;

    public  SinglyLinkedList(){

    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public E first(){
        if(isEmpty())
            return null;
        return head.element;
    }

    public E last(){
        if(isEmpty())
            return null;
        return tail.element;
    }

        public void addFirst(E e){
           head = new Node<>(e,head);
           if(size==0);
           tail=head;
           size++;

        }
        public void addLast(E e){
            Node<E> newestNode = new Node<>(e,null);
            if(isEmpty())
                head = newestNode;
            else
                tail.setNext(newestNode);
            size++;
        }

        public E removeFirst(){
            if(isEmpty())
                return null;
            Node<E> removedNode = head;
            head = head.getNext();
            size--;
            if(size==0)
                tail=null;
            return removedNode.element;
        }
}


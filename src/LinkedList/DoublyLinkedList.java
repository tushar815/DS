package LinkedList;

public class DoublyLinkedList<E> {


    private static class Node<E> {

        private E element ;
        private Node<E> next = null;
        private Node<E> prev = null;

        Node(E e,Node<E> next, Node<E> prev){
            this.element= e;
            this.next = next;
            this.prev = prev;
        }


        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }

    public DoublyLinkedList(){
        head = new Node<>(null,null,null);
        tail= new Node<>(null,null,head);
        head.setNext(tail);
    }

    int size = 0;
    public Node<E> head = null;
    public Node<E> tail = null;


    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public Node<E> first(){
        if(isEmpty())return null;
        return head;

    }
    public Node<E> last(){
        if (isEmpty()) return null;
        return tail;
    }

    public void addFirst(E e){
        if(isEmpty()){
          head = new Node<>(e,tail,null);
          tail = head;
        }
        Node<E> newNode = new Node<>(e,null,null);
        newNode.setNext(head);
        head.setNext(head.getNext());
        head.setPrev(newNode);
        head  = newNode;

        size++;
    }

    public void addLast(E e){
        if(isEmpty()){
            head = new Node<>(e,tail,null);
            tail = head;
        }
        Node<E> newNode = new Node<>(e,null,null);
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
        size++;
    }

    public E removeFirst(){
        if(isEmpty())return null;

        E answer = head.element;

        head = head.getNext();
        if(isEmpty())
            tail=head;
        size--;
return answer;
    }

    public  E removeLast(){
        if(isEmpty())return null;
        E answer = tail.element;

        tail= tail.getPrev();
        if(isEmpty())
            head=tail;
        size--;
        return answer;
    }



}

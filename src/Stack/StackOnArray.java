package Stack;


import com.sun.deploy.util.SyncAccess;

import java.util.Stack;

//stack based on array
/*
limitation :-  fixed size of array not dynamic


 */
public class StackOnArray<E> {

    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1; //index of the top of element
    public StackOnArray(){
        this(CAPACITY);
    }
    public StackOnArray(int capacity){
        data = (E[]) new Object[capacity];
    }
    public int size() {return  t+1;}
    public boolean isEmpty(){ return  t==-1; }
    public void push(E e) throws IllegalStateException{
        if(size() == data.length) throw  new IllegalStateException("stack is full");
        data[++t]=e;
    }
    public E top(){
        if(isEmpty())return  null;
        return data[t];
    }
    public E pop(){
        if(isEmpty()) return null;
        E e = data[t];
        data[t]= null;
        t--;
        return e;

    }

    public void popRecursively(){
        if(isEmpty())return;
        pop();
        popRecursively();
    }


    public static void main(String[] args) {
        StackOnArray<Integer> s = new StackOnArray<Integer>(4);
        s.push(5);
        s.push(3);
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(0);
        System.out.println("before exception");
        s.push(22);

    }

}

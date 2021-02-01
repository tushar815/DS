package Stack;

public class ReverseArray {

    //by using stack based on array
    public static <E> void reverse(E[] a){
        StackOnArray<E> buffer = (StackOnArray<E>) new StackOnArray<>(a.length);

        for(int i=0;i<a.length;i++){
            buffer.push(a[i]);
        }
        for(int i=0;i<a.length;i++){
            a[i]= buffer.pop();
        }

    }

}

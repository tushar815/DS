package Arrays;


import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

// demostrate Arrays UTIL class
public class ArrayP {

    public static void main(String[] args) {
        int[] arrayOne = {1,1,2};
        int[] arrayTwo = {11,4,2,5,3};

    int[] arrayCopy=  Arrays.copyOf(arrayOne,3);

                    Arrays.fill(arrayTwo,2);

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arrayOne.length;i++){
            if(!set.contains(arrayOne[i])){
                    set.add(arrayOne[i]);
            }
        }

        set.size();

    System.out.println( Arrays.toString(arrayOne));

    }


}

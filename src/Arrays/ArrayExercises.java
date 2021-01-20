package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class ArrayExercises {

    /*
    Let A be an array of size n ≥ 2 containing integers from 1 to n−1 inclusive,
     one of which is repeated. Describe an algorithm for finding the integer in A that is repeated.
     */
    public void repeatedIntegerInArray(int[] array){

        //we will create basic brute force example

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("The repeated number in array is "+array[i]+ " in o(n^2) .");

                }
            }
        }

        //another way is to use HashSet

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< array.length;i++){
            if(!set.contains(array[i]))
                set.add(array[i]);
            else
                System.out.println("The repeated number in array is " + array[i]+" in o(n)");

        }

    }


    public void FiveRepeatingNumbers(int[] array){

        int[] count = new int[5];
        int index = 0;

        //brute force o(n * n)
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j] && index<5)  {
                    count[index] = array[i];
                    index++;
                }
            }
        }

     for(int k=0;k<count.length;k++){
         System.out.println("repeated elements are :- "+count[k]);
     }

     int[] countForRepeated = new int[5];
     int c = 0;
     HashSet<Integer> repeatedSet = new HashSet<>();
     for(int i=0;i<array.length;i++){
         if(repeatedSet.contains(array[i])){
            countForRepeated[c]=array[i];
            c++;
         }
         else
             repeatedSet.add(array[i]);
     }
        for(int k=0;k<countForRepeated.length;k++){
            System.out.println("repeated elements are :- "+countForRepeated[k]);
        }

    }

    public static void main(String[] args) {
    ArrayExercises a = new ArrayExercises();
    int[] array = {1,2,4,3,6,4,5};
  //  a.repeatedIntegerInArray(array);
    int[] fiveNumberArray = {1,2,1,3,4,3,4,5,6,5,6,7};
    a.FiveRepeatingNumbers(fiveNumberArray);

    }
}

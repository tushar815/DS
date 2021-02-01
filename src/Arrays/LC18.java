package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LC18 {

    public List<List<Integer>> fourSum(int[] nums, int target){

        //First sort the array becasue we are using two pointers
        Arrays.sort(nums);
        int LenArray = nums.length;

        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i< nums.length-3;i++){

            int leftValue = i+1;
            int rightValue =  LenArray-1;
            int middleValue = rightValue-1;

            while(leftValue < rightValue){

                int sums = nums[i]+nums[leftValue]+nums[middleValue]+nums[rightValue];
                if(sums == target)  set.add(Arrays.asList(nums[i],nums[leftValue],nums[middleValue],nums[rightValue]));
                if(sums < target)
                    i++;
                if(sums> target)
                    rightValue--;


            }
        }

        return new ArrayList<>(set);


    }

    public static void main(String[] args) {
        LC18 l = new LC18();
        int nums[] ={1,0,-1,0,-2,2};
        l.fourSum(nums,0);
    }
}

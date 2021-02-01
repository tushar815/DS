package Arrays;

import java.util.*;

/*
Given an array nums of n integers, are there elements a, b, c in nums
such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.
 */
public class LC15 {

    //my attempt failed at some test cases
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer>CopySortedList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=i+2;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0  && (i!=j && i!=k && j!=k)){
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[k]);

                        tempList.sort(Integer::compareTo);
                        if(CopySortedList.containsAll(tempList))
                            continue;

                        CopySortedList.addAll(tempList);
                        finalList.add(tempList);
                    }
                    tempList = new ArrayList<>();
                }
            }
        }
        return finalList;

    }

    public List<List<Integer>> threeSum2(int[] nums){
        if(nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length -2 ;i++){
            int j=i+1;
            int k = nums.length-1;
            while (j < k){
                int sums = nums[i] + nums[j] +nums[k];
                if(sums==0) set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                else if(sums > 0) k--;
                else if(sums < 0) j++;
            }
        }
        return new ArrayList<>(set);

    }


        public static void main(String[] args) {


        LC15 l = new LC15();
     /*   int[] nums = {1,2,-2,-1};
        l.threeSum(nums);*/
        int[] nums2 = {-1,0,1,2,-1,-4};

        l.threeSum2(nums2);
       /* int[] nums3 = {0};

        l.threeSum(nums3);*/
    }


}

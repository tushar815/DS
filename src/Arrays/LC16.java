package Arrays;

import java.util.*;

public class LC16 {

    public int threeSumClosest(int[] nums, int target){

        //to count the gap between target and sum
        int gap = Integer.MAX_VALUE;

        int ans =0;
        int n =nums.length;

        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];
                int currentGap = Math.abs(sum - target);

                if (currentGap < gap) {
                    gap = currentGap;
                    ans = sum;
                }
                if (sum < target)
                    left++;
                else
                    right--;
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        LC16 l = new LC16();
        int[] nums  ={-1,2,1,-4};
        l.threeSumClosest(nums,1);
    }
}

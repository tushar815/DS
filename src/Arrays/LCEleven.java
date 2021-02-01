package Arrays;


//https://leetcode.com/problems/container-with-most-water/
public class LCEleven {


    public int maxArea(int[] height) {
    int maxArea =0;
    int l=0;
    int r=height.length-1;
    while(l < r){
        maxArea = Math.max(maxArea, Math.min(height[l],height[r]) * (r - l));
        if(height[l]< height[r])
            l++;
        else
            r--;
        }
        return maxArea;

    }

    public static void main(String[] args) {
        LCEleven eleven = new LCEleven();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(eleven.maxArea(height));
        int[] height1 = {1,1};
        System.out.println(eleven.maxArea(height1));
        int[] height2 = {4,3,2,1,4};
        System.out.println(eleven.maxArea(height2));
        int[] height3 = {1,2,1};
        System.out.println(eleven.maxArea(height3));
        int[] height4 = {1,2};
        System.out.println(eleven.maxArea(height4));
    }
}

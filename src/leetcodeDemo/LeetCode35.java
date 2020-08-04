package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Search Insert Position
 * @author: lingving
 * @create: 2020-08-04 20:35
 **/
public class LeetCode35 {

    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (right-left) / 2 + left;
            if(nums[mid] > target){
                right = mid-1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                return mid;
            }

        }
        return left;

    }
}

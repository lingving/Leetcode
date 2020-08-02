package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Search in Rotated Sorted Array
 * @author: lingving
 * @create: 2020-08-02 10:13
 **/
public class LeetCode33 {

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < nums[right]){
                if(nums[mid] < target && target <= nums[right])
                    left = mid+1;
                else
                    right = mid-1;
            }
            else{
                if(nums[left] <= target && target < nums[mid])
                    right = mid-1;
                else
                    left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int res = new LeetCode33().search(nums,target);
        System.out.println(res);
    }
}

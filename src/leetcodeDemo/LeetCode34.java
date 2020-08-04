package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Find First and Last Position of Element in Sorted Array
 * @author: lingving
 * @create: 2020-08-04 19:46
 **/
public class LeetCode34 {

    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        // check nums
        if(nums == null ||nums.length == 0){
            return res;
        }
        if(nums.length == 1){
            return  nums[0] == target ? new int[]{0,0} : res;
        }

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                int l = mid , r = mid;
                while ((r + 1) < nums.length && nums[r+1] == target) r++;
                while ((l-1) >= 0 && nums[l-1] == target) l--;
                res[0] = l;
                res[1] = r;
                return res;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {5,8,8,8,8,10};
        int target = 8;
        int[] res = new LeetCode34().searchRange(nums,target);
        System.out.println(res[0]+"&"+res[1]);
    }
}

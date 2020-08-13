package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Search in Rotated Sorted Array II
 * @author: lingving
 * @create: 2020-08-12 22:03
 **/
public class LeetCode81 {
    public boolean search(int[] nums, int target) {
        int l = 0 ;
        int r = nums.length - 1;
        while(l < r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){   // 直接搜索到
                return true;
            }else if(nums[mid] < nums[r]){
                if(nums[mid] <= target && nums[r] >= target) {//在右半边
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }else if(nums[mid] > nums[l]){
                if(nums[l] <= target && nums[mid] >= target){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }else{
                if(nums[mid] == nums[l]){
                    l++;
                }else{
                    r--;
                }
            }

        }
        return false;

    }

    public static void main(String[] args){
        int[] n = {2,5,6,0,0,1,2};
        int t = 3;
        boolean res = new LeetCode81().search(n,t);
        System.out.println(res);
    }
}

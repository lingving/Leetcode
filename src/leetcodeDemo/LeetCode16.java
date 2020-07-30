package leetcodeDemo;

import java.util.Arrays;

/**
 * @program: Leetcode
 * @description: 3Sum Closest
 * 先排序
 * 双指针
 * @author: lingving
 * @create: 2020-07-30 21:04
 **/
public class LeetCode16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closesum = nums[0] + nums[1] + nums[2];
        for(int i = 0 ; i <= nums.length - 2 ; i++ ) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) { // 左指针不超过右指针
                int temp = nums[i] + nums[l] + nums[r];
                if (Math.abs(temp - target) < Math.abs(closesum - target)) {//判断当前值是否更接近target
                    closesum = temp;
                }
                if (temp > target) {//当前值大于target ，说明右边值偏大，右指针左移
                    r--;
                } else if (temp < target) {//当前值大于target ，说明左边值偏小，左指针右移
                    l++;
                } else {//相等便是target自身
                    return target;
                }
            }
        }

        return closesum;
    }


    public static void main(String[] args){
        int[] nums = {-1,2,1,-4,5,6};
        int target = 1;
        int res = new LeetCode16().threeSumClosest(nums,target);
        System.out.println(res);
    }

}

package JianZhiOffer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: Leetcode
 * @description: 剑指 Offer 03. 数组中重复的数字
 * @author: lingving
 * @create: 2020-08-14 07:16
 **/
public class Jz03 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;

                break;
            }
        }
        return repeat;
    }


}

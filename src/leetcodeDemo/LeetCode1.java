package leetcodeDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode
 * @description: two sum
 * @author: lingving
 * @create: 2020-06-23 19:27
 **/
public class LeetCode1 {

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0) return nums;
        int[] result = new int[2];
        Map<Integer ,Integer> temp = new HashMap<>();
        for(int i  = 0;i< nums.length;i++){
            int res = target - nums[i];
            if(temp.containsKey(res)){
                result[0] = temp.get(res);
                result[1] = i;
                return result;
            }else{
                temp.put(nums[i] ,i);
            }
        }

        return result;
    }



    public static void main(String[] args){
         int[] nums = new int[]{2, 7, 11, 15};
         int target = 9;
         int[] res = new LeetCode1().twoSum(nums,target);
         System.out.println( res[0]+" , "+res[1]);
    }
}

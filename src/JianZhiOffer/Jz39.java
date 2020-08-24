package JianZhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Leetcode
 * @description: 数组中出现次数超过一半的数字
 * @author: lingving
 * @create: 2020-08-22 19:57
 **/
public class Jz39 {
    public int majorityElement(int[] nums) {
        int mid = nums.length / 2;
        Map<Integer,Integer> res = new HashMap<>();
        int count = 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(res.containsKey(nums[i])){
                count = res.get(nums[i])+1;
                if(count > mid){
                    return nums[i];
                }
                res.put(nums[i],count);
            }else {
                res.put(nums[i],1);
            }

        }
        return nums[0];

    }


    public int majorityElement2(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) {
                x = num;
            }
            votes += (num == x) ? 1 : -1;
        }
        return x;
    }


}

package JianZhiOffer;

/**
 * @program: Leetcode
 * @description: 调整数组顺序使奇数位于偶数前面
 * @author: lingving
 * @create: 2020-08-20 21:31
 **/
public class Jz21 {
    public int[] exchange(int[] nums) {
        if(nums == null ){
            return null;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            while (left < right && (nums[left] & 1) != 0){
                left ++;
            }
            while (left < right && (nums[right] & 1) == 0){
                right --;
            }
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;

    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] res = new Jz21().exchange(nums);
        for(int a : res)
        System.out.println(a);
    }
}

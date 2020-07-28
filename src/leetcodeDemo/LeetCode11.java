package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Container With Most Water
 * @author: lingving
 * @create: 2020-07-28 20:43
 **/
public class LeetCode11 {

    /**
     * 暴力解法
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int maxSize = 0;
        for(int i = 0; i < height.length; i++){
            int temp = 0;
            for(int j = 1 ; j < height.length; j++){
                if(height[i] > height[j]){
                    temp = (j-i) * height[j];
                }else{
                    temp = (j-i) * height[i];
                }
                maxSize = Math.max(maxSize,temp);
            }
        }
        return maxSize;
    }

    /**
     * 双指针法
     * @param height
     * @return
     */
    public int maxArea1(int[] height) {
        int maxSize = 0;
        int i = 0 ; int j = height.length - 1;
        while (i < j ){
            int temp = (j - i) * Math.min(height[i] , height[j]);
            maxSize = Math.max(temp,maxSize);
            if(height[i] >= height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxSize;
    }



    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int max = new LeetCode11().maxArea1(height);
        System.out.println(max);
    }
}

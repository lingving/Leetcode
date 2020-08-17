package JianZhiOffer;

/**
 * @program: Leetcode
 * @description: 旋转数组的最小数字
 * @author: lingving
 * @create: 2020-08-17 22:41
 **/
public class Jz11 {

    public int minArray(int[] numbers) {
        int l = 0 ;
        int r = numbers.length -1;

        while(l < r){
            int mid = l + (r - l )/2;
            if(numbers[mid] > numbers [r]) {
                l = mid + 1;
            }else if (numbers[mid] < numbers[r]){
                r = mid  ;
            }else {
                r--;
            }

        }
        return numbers[l];

    }
}

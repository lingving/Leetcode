package JianZhiOffer;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: Leetcode
 * @description: 最小的k个数
 * @author: lingving
 * @create: 2020-08-23 10:07
 **/
public class Jz40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for(int i = 0 ;i < k ;i++){
            res[i] = arr[i];
        }
        return res;


    }

    /*
    * 使用固定堆
     */
    public int[] getLeastNumbers2(int[] arr, int k) {
        if(k == 0){
            return new int[0];
        }
        Queue<Integer> q = new PriorityQueue<>(k,(i1 ,i2)->Integer.compare(i1,i2));
        for(int a : arr){
            if(a < q.peek() || k < q.size() || q.isEmpty()){
                q.offer(a);
            }
            if(q.size() > k){
                q.poll();
            }
        }
        // 将堆中的元素存入数组
        int[] res = new int[q.size()];
        int j = 0;
        for (int e : q) {
            res[j++] = e;
        }
        return res;

    }



    public static void main(String[] args){
        int[] nums = {1,4,5,7,7,2};
        int k = 2;
        int[] res = new Jz40().getLeastNumbers(nums,k);
        for(int a : res)
        System.out.println(a);
    }
}

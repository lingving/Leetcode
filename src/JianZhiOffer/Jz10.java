package JianZhiOffer;

/**
 * @program: Leetcode
 * @description: fib
 * @author: lingving
 * @create: 2020-08-16 10:29
 **/
public class Jz10 {
    public int fib(int n) {
        if(n == 0) return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i <= n;i++){
            dp[i] =  dp[i-1] + dp[i-2];
            dp[i] = dp[i] % 1000000007;
        }
        return dp[n];
    }
    public int fib2(int n) {
        if(n == 0) return 0;
        int a = 0 ,b = 1, sum;
        for(int i = 0;i <= n;i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum ;
        }
        return a;
    }

}

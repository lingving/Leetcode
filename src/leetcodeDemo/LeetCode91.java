package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Decode Ways
 * @author: lingving
 * @create: 2020-08-10 22:27
 **/
public class LeetCode91 {
    public int numDecodings(String s) {
        int len = s.length();
        if(len == 0){
            return 0;
        }
        int[] dp = new int[len];
        char[] charArr = s.toCharArray();
        if(charArr[0] == '0'){
            return 0;
        }
        dp[0] = 1;
        for(int i = 1; i < len ; i++){
            if(charArr[i] != '0'){
                dp[i] = dp[i-1];
            }
            int num = 10 * (charArr[i-1] - '0') + (charArr[i] - '0');
            if(num >= 10 && num <= 26){
                if(i == 1){
                    dp[i]++;
                }else{
                    dp[i] += dp[i-2];
                }
            }
        }
        return dp[len-1];

    }

    public static void main(String[] args){
        String s = "1226";
        int res = new LeetCode91().numDecodings(s);
        System.out.println(res);

    }
}

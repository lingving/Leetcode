package leetcodeDemo;

import java.util.Stack;

/**
 * @program: Leetcode
 * @description: Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * @author: lingving
 * @create: 2020-06-28 19:05
 **/
public class LeetCode5 {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;

        // dp[i][j] 表示 s[i, j] 是否是回文串
        //状态转移方程 dp[i][j] = dp[i+1][j-1] && s[i] == s[j]
        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                // 只要 dp[i][j] == true 成立，就表示子串 s[i..j] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }


    public static void main(String[] args){
        String res = new LeetCode5().longestPalindrome("babad");
        System.out.println(res);
    }
}

package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Unique Paths
 * @author: lingving
 * @create: 2020-08-06 21:59
 **/
public class LeetCode62 {

    public int uniquePaths(int m, int n) {
        //状态转移方程 dp[i][j] = dp[i][j-1] + dp[i-1][j]
        if(m == 1 || n == 1){
            return 1;
        }
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i = 0 ; i < m ; i++){
            for( int j = 0 ; j < n ; j++){
                if( i == 0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i][j-1] + dp[i-1][j] ;
                }
            }

        }
        return dp[m-1][n-1];
    }
}

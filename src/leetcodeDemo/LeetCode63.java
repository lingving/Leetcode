package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Unique Paths II
 * @author: lingving
 * @create: 2020-08-07 22:03
 **/
public class LeetCode63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //状态转移方程 dp[i][j] = dp[i][j-1] + dp[i-1][j] && obstacleGrid[i][j] != 1
        // if obstacleGrid[i][j] == 1, dp[i][j] = 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1] == 1){
            return 0;
        }
        int[][] dp = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for( int j = 0 ; j < n ; j++){
                if( obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else{
                    if(i == 0 && j == 0){
                        dp[i][j] = 1;
                    }else if( i == 0){
                        dp[i][j] = dp[0][j - 1];
                    }else if ( j == 0){
                        dp[i][j] = dp[i - 1][0];
                    }else{
                        dp[i][j] = dp[i][j-1] + dp[i-1][j] ;
                    }

                }
            }

        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args){
        int[][] t = {{1,0}};
        int res = new LeetCode63().uniquePathsWithObstacles(t);
        System.out.println(res);
    }
}

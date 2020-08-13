package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Search a 2D Matrix
 * @author: lingving
 * @create: 2020-08-12 20:46
 **/
public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0  ) return false;
        int m = 0;
        int n = matrix[0].length -1;
        while(n >= 0 && m < matrix.length){
            if(target > matrix[m][n]){
                m++;
            }else if( matrix[m][n] > target){
                n--;
            }else{
                return true;
            }
        }

        return false;
    }
    public boolean searchMatrix2(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0  )
            return false;
        int i = ColBinarySearch(matrix, target);
        if(i >= matrix.length)
            return false;
        int j = RowBinarySearch(matrix, i, target);
        if(j >= matrix[0].length)
            return false;
        if(matrix[i][j] == target)
            return true;

        return false;
    }

    public int ColBinarySearch(int[][] matrix, int target) {
        int l = 0, r = matrix.length-1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(matrix[mid][0] <= target)
                l = mid + 1;
            else
                r = mid;
        }
        if(matrix[l][0] <= target)
            return l;
        return Math.max(l-1,0);
    }

    public int RowBinarySearch(int[][] matrix, int i, int target) {
        int l = 0, r = matrix[0].length-1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(matrix[i][mid] <= target)
                l = mid + 1;
            else
                r = mid;
        }
        if(matrix[i][l] <= target)
            return l;
        return Math.max(l-1,0);
    }

    public static void main(String[] args){
        int[][] m = {{1}};
        int t = 1 ;
        boolean res = new LeetCode74().searchMatrix2(m,t);
        System.out.println(res);

    }
}

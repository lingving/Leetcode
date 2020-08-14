package JianZhiOffer;

/**
 * @program: Leetcode
 * @description: 二维数组中的查找
 * @author: lingving
 * @create: 2020-08-14 21:45
 **/
public class Jz04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int i = 0 ;
        int j = matrix[i].length - 1;
        while (i >= 0 && i < matrix.length && j >= 0 && j < matrix[i].length){
            if(matrix[i][j] < target){
                i ++;
            }else if(matrix[i][j] > target){
                j --;
            }else{
                return true;
            }

        }
        return false;

    }

}

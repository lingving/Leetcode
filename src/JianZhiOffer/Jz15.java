package JianZhiOffer;

/**
 * @program: Leetcode
 * @description: 二进制中1的个数
 * @author: lingving
 * @create: 2020-08-19 21:51
 **/
public class Jz15 {

    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}

package leetcodeDemo.Easy;

/**
 * @program: Leetcode
 * @description: Given two binary trees, write a function to check if they are the same or not.
 * @author: lingving
 * @create: 2020-06-30 19:24
 **/
public class LeetCode100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null) return false;
        if(q == null) return false;
        if(p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else{
            return false;
        }

    }
}

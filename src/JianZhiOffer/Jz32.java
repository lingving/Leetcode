package JianZhiOffer;

import leetcodeDemo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Leetcode
 * @description: 从上到下打印二叉树 II
 * @author: lingving
 * @create: 2020-08-21 23:08
 **/
public class Jz32 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for(int i = 0;i < size ;i++){
                TreeNode r = q.poll();
                if(r.left != null ){
                    q.add(r.left);
                }
                if(r.right != null){
                    q.add(r.right);
                }
                temp.add(r.val);
            }

            res.add(temp);
        }
        return res;


    }
}

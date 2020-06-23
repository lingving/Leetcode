package leetcodeDemo.Easy;

/**
 * @program: Leetcode
 * @description: Add Two Numbers
 * @author: lingving
 * @create: 2020-06-23 19:57
 **/
public class LeetCode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fi = new ListNode(0);
        ListNode node = fi;
        int pre = 0 ;
        while(l1 != null || l2 != null || pre != 0){
            int l1val = l1 != null ? l1.val:0;
            int l2val = l2 != null ? l2.val:0;
            int sum = l1val + l2val + pre;

            pre = sum/10;
            ListNode newnode = new ListNode(sum%10);
            node.next = newnode;
            node = newnode;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return fi.next;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

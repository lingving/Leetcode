package leetcodeDemo;

/**
 * @program: Leetcode
 * @description: Merge Two Sorted Lists
 * @author: lingving
 * @create: 2020-08-11 22:30
 **/
public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);// 初始化头结点
        ListNode listNode1 = listNode;//以l1为合并后的链表
        while(l1 !=null && l2!=null){
            if(l1.val > l2.val){
                listNode1.next = l2;
                listNode1 = listNode1.next;
                l2 = l2.next;
            }else{
                listNode1.next = l1;
                listNode1 = listNode1.next;
                l1 = l1.next;
            }
        }
        if(l1 != null){
            listNode1.next = l1;
        }
        if(l2 != null){
            listNode1.next = l2;
        }
        return   listNode.next;
    }
}

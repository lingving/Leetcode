package JianZhiOffer;

/**
 * @program: Leetcode
 * @description: 链表中倒数第k个节点
 * @author: lingving
 * @create: 2020-08-20 22:10
 **/
public class Jz22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = head;
        int count = 0;
        while(pre != null){
            count ++;
            pre = pre.next;
        }
        int i = 1;
        int index =  count-k+1;
        while(i < index){
            dummy = dummy.next;
            index -- ;

        }
        return dummy.next;

    }

    public ListNode getKthFromEnd2(ListNode head, int k) {
        ListNode dummy = head;
        ListNode pre = head;

        while(k > 0 && pre != null){
            pre = pre.next;
            k--;
        }
        while(pre != null && dummy != null){
            pre = pre.next;
            dummy = dummy.next;
        }
        return dummy;


    }
}

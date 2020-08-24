package JianZhiOffer;

/**
 * @program: Leetcode
 * @description: 反转链表
 * @author: lingving
 * @create: 2020-08-21 23:02
 **/
public class Jz24 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;

    }
}

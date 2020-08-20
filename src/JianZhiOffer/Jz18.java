package JianZhiOffer;

/**
 * @program: Leetcode
 * @description: 删除链表的节点
 * @author: lingving
 * @create: 2020-08-20 21:30
 **/
public class Jz18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre = dummy;
        while (cur != null) {
            if (cur.val == val) {
                //如果找到要删除的结点，直接把他删除
                pre.next = cur.next;
                break;
            }
            //如果没找到，pre指针和cur指针都同时往后移一步
            pre = cur;
            cur = cur.next;
        }
        //最后返回虚拟节点的下一个结点即可
        return dummy.next;


    }

}

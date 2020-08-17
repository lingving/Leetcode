package JianZhiOffer;



/**
 * @program: Leetcode
 * @description: 从尾到头打印链表
 * @author: lingving
 * @create: 2020-08-15 22:39
 **/
public class Jz06 {
    public int[] reversePrint(ListNode head) {
        ListNode cur = head ;
        int count = 0;
        while (cur != null){
            cur = cur.next;
            count++;
        }
        cur = head;
        int[] nums = new int[count];

        for (int i = count - 1; i >= 0; --i) {
            nums[i] = cur.val;
            cur = cur.next;
        }
        return nums;

    }
}

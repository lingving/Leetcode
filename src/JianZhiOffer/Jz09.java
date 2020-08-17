package JianZhiOffer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: Leetcode
 * @description: 用两个栈实现队列
 * @author: lingving
 * @create: 2020-08-16 09:59
 **/
public class Jz09 {
    Deque<Integer> list;
    Deque<Integer> list2;
    public Jz09() {
         list = new LinkedList<Integer>();
         list2  = new LinkedList<Integer>();

    }

    public void appendTail(int value) {
        list.push(value);

    }

    public int deleteHead() {
        if(list2.isEmpty()){
            while(!list.isEmpty()){
                list2.push(list.pop());
            }
        }

        if(!list2.isEmpty()){
            return list2.pop();
        }else{
            return -1;
        }

    }
}

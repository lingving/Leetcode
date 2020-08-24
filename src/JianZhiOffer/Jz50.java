package JianZhiOffer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: Leetcode
 * @description: 第一个只出现一次的字符
 * @author: lingving
 * @create: 2020-08-24 21:43
 **/
public class Jz50 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new LinkedHashMap<>();
        char[] arr = s.toCharArray();
        for(char c : arr)
            map.put(c, !map.containsKey(c));
        for(Map.Entry<Character, Boolean> d : map.entrySet()){
            if(d.getValue()) return d.getKey();
        }
        return ' ';


    }
}

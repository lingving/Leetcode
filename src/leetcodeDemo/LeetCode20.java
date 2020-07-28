package leetcodeDemo.Easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * @program: leetcode
 * @description: leetcode easy problems
 * @author: lingving
 * @create: 2019-11-14 21:26
 **/
public class LeetCode20 {


    /**
    * @Description:  leetcode 20
    * @Param:
    * @return:
    * @Author: lingving
    * @Date: 2019/11/14
    */
    public static boolean isValid(String s) {
         HashMap<Character,Character> mapping = new HashMap<>();
         mapping.put(')','(');
         mapping.put('}','{');
         mapping.put(']','[');

         Stack<Character> stack = new Stack<>();
         char[] chars = s.toCharArray();
         for(char achar : chars ){
             if(mapping.containsKey(achar)){
                 if(mapping.get(achar)!=(stack.empty()?'#':stack.pop())){
                     return false;
                 }
             }else{
                 stack.push(achar);
             }
        }
         return stack.isEmpty();
    }

    public static boolean isValidSec(String s) {
        Stack<Character> stack1 = new Stack<>();
        stack1.push('#');
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack1.push(c);
            } else if (c == ')' && stack1.pop() != '(') {
                return false;
            } else if (c == ']' && stack1.pop() != '[') {
                return false;
            } else if (c == '}' && stack1.pop() != '{') {
                return false;
            }
        }

        return stack1.size()==1;
    }


    public static boolean isValidThird(String s) {
        char[] stack = new char[s.length() + 1];
        int top = 1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[top++] = c;
            } else if (c == ')' && stack[--top] != '(') {
                return false;
            } else if (c == ']' && stack[--top] != '[') {
                return false;
            } else if (c == '}' && stack[--top] != '{') {
                return false;
            }
        }
        return top == 1;
    }

    public static void main(String[] args){
         String s = "{[]}";
         System.out.println("result :"+isValidThird(s));

    }
}

package com.practise.interviewquestions.questions;

import java.util.Stack;
/*
    Create a Java Method to Check for Balanced Opening and Closing Brackets
 */

public class IsBalancedBracket {
    public static boolean isBalanced(String s){

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(')
                stack.push(ch);
            else {
                if(stack.isEmpty())
                    return false;
                char peek = stack.peek();
                if((ch == '}' && peek == '{') || (ch == ']' && peek == '[')|| (ch == ')' && peek == '(')){
                    stack.pop();
                }
                else
                    return false;

            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "[[{{}}]]";
        System.out.println(isBalanced(s1));
    }
}

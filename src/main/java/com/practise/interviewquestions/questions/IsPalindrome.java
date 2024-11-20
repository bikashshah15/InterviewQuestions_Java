package com.practise.interviewquestions.questions;

public class IsPalindrome {
    public static boolean isPalindrome(String s){
        s = s.trim().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        return s.contentEquals(sb.reverse());
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

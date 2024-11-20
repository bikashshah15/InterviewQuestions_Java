package com.practise.interviewquestions.questions;
/*
 * Problem: Remove Adjacent "01" or "10" Pairs from a String
 *
 * You are given a binary string `s` (a string containing only '0', '1', or additional characters).
 * Your task is to repeatedly remove any adjacent pairs of "01" or "10" until no such pairs exist,
 * and return the length of the resulting string.
 *
 * Constraints:
 * - The input string `s` may contain characters other than '0' and '1'. Such characters should
 *   remain unaffected by the removal process.
 * - The process continues until no adjacent "01" or "10" pairs remain in the string.
 *
 * Examples:
 *
 * Example 1:
 * Input: `s = "01010"`
 * Output: `1`
 * Explanation:
 * - Remove "01" at index 0: "01010" → "010"
 * - Remove "10" at index 1: "010" → "0"
 * - Final string: "0" → Length = 1
 *
 * Example 2:
 * Input: `s = "111000"`
 * Output: `6`
 * Explanation:
 * - No adjacent "01" or "10" pairs exist. The string remains unchanged.
 * - Final string: "111000" → Length = 6
 *
 * Example 3:
 * Input: `s = "111*000"`
 * Output: `7`
 * Explanation:
 * - No adjacent "01" or "10" pairs exist. The string remains unchanged.
 * - Final string: "111*000" → Length = 7
 *
 * Implementation Notes:
 * - Two solutions are provided:
 *   1. `solution`: Uses a `StringBuilder` to find and remove pairs efficiently.
 *   2. `solution2`: Uses `String` methods such as `contains` and `replace` for simplicity.
 * - Both methods return the length of the final string after all pairs are removed.
 */


public class Remove01FromInputString {
    public static int solution(String s){
        StringBuilder sb = new StringBuilder(s);
        int index;
        while ((index = sb.indexOf("01")) != -1 || (index =sb.indexOf("10")) != -1){
            sb.delete(index,index+2);
        }
        return sb.length();
    }
    public static int solution2(String s){
        while (s.contains("01") || s.contains("10")){
            s = s.replace("01","").replace("10","");
        }
        return s.length();
    }
    public static void main(String[] args) {
        System.out.println(solution2("01010"));
        System.out.println(solution2("111000"));
        System.out.println(solution2("111*000"));
    }
}

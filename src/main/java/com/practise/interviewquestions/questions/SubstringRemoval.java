package com.practise.interviewquestions.questions;
/*
 * Problem: Minimum Length of String After Substring Removal
 *
 * You are given a string `seq` consisting of characters 'A' and 'B'. Your task is to repeatedly
 * remove adjacent pairs of the form:
 * - "AB"
 * - "BB"
 *
 * If a character can be removed as part of either pair, it should be removed. Continue the process
 * until no more valid pairs can be removed. Return the length of the resulting string.
 *
 * Examples:
 *
 * Example 1:
 * Input: `seq = "BABAAABABABBAAAABB"`
 * Output: `4`
 * Explanation:
 * - Remove "BA" at index 0: "BABAAABABABBAAAABB" → "ABAAABABABBAAAABB"
 * - Remove "AB" at index 0: "ABAAABABABBAAAABB" → "AAABABABBAAAABB"
 * - Remove "BB" at index 4: "AAABABABBAAAABB" → "AAABABAABAAAABB"
 * - Continue removing pairs until no pairs remain.
 * - Final string: "AAAA" → Length = 4
 *
 * Example 2:
 * Input: `seq = "BBBAB"`
 * Output: `1`
 * Explanation:
 * - Remove "BB" at index 0: "BBBAB" → "BAB"
 * - Remove "BA" at index 0: "BAB" → "B"
 * - Final string: "B" → Length = 1
 *
 * Example 3:
 * Input: `seq = "A"`
 * Output: `1`
 * Explanation:
 * - No pairs can be removed. The string remains unchanged.
 * - Final string: "A" → Length = 1
 *
 * Constraints:
 * - The input string `seq` consists only of characters 'A' and 'B'.
 * - The length of `seq` is not constrained but should be within reasonable limits for computation.
 *
 * Implementation Notes:
 * - This implementation uses a stack to efficiently manage the removal of pairs:
 *   - Push characters onto the stack.
 *   - If the current character is 'B' and the top of the stack contains 'A' or 'B', pop the stack
 *     (remove the pair).
 *   - Otherwise, push the character onto the stack.
 * - The size of the stack after processing represents the length of the final string.
 */


public class SubstringRemoval {
    public static int solution(String seq){
        while (seq.contains("AB") || seq.contains("BB")){
            seq = seq.replace("AB","").replace("BB","");
        }
        return seq.length();
    }
    public static void main(String[] args) {
        String input = "BBBAB"; // Replace with your input
        int minLength = solution(input);
        System.out.println("The minimum length is: " + minLength);
    }
}

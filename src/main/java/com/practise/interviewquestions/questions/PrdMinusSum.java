package com.practise.interviewquestions.questions;
/*
 * Given a positive integer `n`, your task is to calculate the difference between
 * the product of its digits and the sum of its digits.
 *
 * Note: The order matters; the answer should be in the form:
 * `product - sum` (not `sum - product`).
 *
 * Example 1:
 * For `n = 123456`, the output should be `solution(n) = 699`.
 *
 * Explanation:
 * - The product of the digits is: 1 * 2 * 3 * 4 * 5 * 6 = 720
 * - The sum of the digits is: 1 + 2 + 3 + 4 + 5 + 6 = 21
 * - So, the final answer is: 720 - 21 = 699
 *
 * Example 2:
 * For `n = 1010`, the output should be `solution(n) = -2`.
 *
 * Explanation:
 * - The product of the digits is: 1 * 0 * 1 * 0 = 0
 * - The sum of the digits is: 1 + 0 + 1 + 0 = 2
 * - So, the final answer is: 0 - 2 = -2
 */

public class PrdMinusSum {
    public  static  int prdMinusSum(int n){

        int product = 1;
        int sum = 0;

        while (n!=0){
            int num = n%10;
            n = n/10;

            product *= num;
            sum += num;
        }
        return product - sum;
    }
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(prdMinusSum(n));
    }
}

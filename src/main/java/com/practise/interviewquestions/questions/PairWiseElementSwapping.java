package com.practise.interviewquestions.questions;

import java.util.Arrays;
/*
 * You are given an array of integers `arr`. Consider its elements in pairs:
 * (arr[0], arr[1]), (arr[2], arr[3]), and so on. Arrange the elements in each pair
 * in ascending order. In other words, swap the position of paired elements if the left
 * element is greater than the right one.
 *
 * If `arr` contains an odd number of elements, the last element should be left unchanged.
 *
 * Note: You are not expected to provide the most optimal solution, but a solution with
 * time complexity not worse than O(arr.length) will fit within the execution time limit.
 *
 * Example:
 * For arr = [1, 5, 7, 3, 2, 1], the output should be `solution(arr) = [1, 5, 3, 7, 1, 2]`.
 *
 * Explanation:
 * The given array consists of 3 pairs: (1, 5), (7, 3), (2, 1).
 * After arranging elements in each pair in ascending order, we get (1, 5), (3, 7), (1, 2).
 * So, the answer is [1, 5, 3, 7, 1, 2].
 *
 * For arr = [6, 7, 8, 8, 5, 3, 2], the output should be `solution(arr) = [6, 7, 8, 8, 3, 5, 2]`.
 *
 * Explanation:
 * The given array consists of 3 pairs and 1 remaining element: (6, 7), (8, 8), (5, 3), and (2).
 * After arranging elements in each pair in ascending order, we get: (6, 7), (8, 8), (3, 5), and (2).
 * So, the answer is [6, 7, 8, 8, 3, 5, 2].
 */


public class PairWiseElementSwapping {
    public static int[] pairWiseElementSwapping(int[] arr){

        for (int i = 0; i < arr.length-1 ; i+=2) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 3, 2, 1};
        int[] result1 = pairWiseElementSwapping(arr1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {6, 7, 8, 8, 5, 3, 2};
        int[] result2 = pairWiseElementSwapping(arr2);
        System.out.println(Arrays.toString(result2));
    }
}

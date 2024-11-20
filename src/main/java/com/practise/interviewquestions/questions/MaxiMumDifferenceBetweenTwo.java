package com.practise.interviewquestions.questions;
/*

 * Maximum Difference between Two Elements such that Larger Element Appears after the Smaller Element
 * Find the maximum difference between two elements in an array such that the larger element comes after the smaller element. For example, given the array [2, 3, 10, 6, 4, 8, 1], the output should be 8 because the maximum difference is 10 - 2.
 * */

public class MaxiMumDifferenceBetweenTwo {
    public static int  maxDifference(int[] arr){
        int maxDiff = arr[1] - arr[0];
        int minNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-minNum > maxDiff)
                maxDiff = arr[i] - minNum;
            if(arr[i]<minNum)
                minNum = arr[i];
        }
        return Math.max(maxDiff,0);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maxDifference(arr));
    }
}

package com.revature.codingPrompts;

import java.util.Arrays;

public class sept30LargestGap {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
        int N = 11;
        System.out.println(largestGap(arr, N));
    }

    public static int largestGap(int[] arr, int N){
        Arrays.sort(arr);
        int gap = 0;
        for (int i = 0; i < N-1; i++){
            int newGap = Math.abs(arr[i]-arr[i+1]);
            if (newGap > gap) {
                gap = newGap;
            }
        }
        return gap;
    }

}

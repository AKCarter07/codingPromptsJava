package com.revature.codingPrompts;

import java.util.Arrays;

public class sept23 {
    public static void main(String[] args) {
        int[][] list = {{1, 2, 3}, {10, 15, 5}, {100, 999, 500}};
        int N = 3;
        int[] result = secondMax(list, N);
        for (int i: result){
            System.out.println(i);
        }

        String S = "ab1231da";
        System.out.println(sumDigits(S));


    }

    public static int[] secondMax(int[][] list, int N) {
        int[] result = new int[N];
        for (int i = 0; i < N; i++){
            Arrays.sort(list[i]);
            result[i] = list[i][1];
        }

        return result;
    }

    public static int sumDigits(String S){

        int sum = 0;
        for (int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if (Character.isDigit(ch)){
                sum += (ch - '0');
            }
        }

        return sum;
    }
}

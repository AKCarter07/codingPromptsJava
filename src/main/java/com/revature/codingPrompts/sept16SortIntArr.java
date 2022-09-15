package com.revature.codingPrompts;

import java.util.Arrays;
import java.util.Collections;

public class sept16SortIntArr {
    public static void main(String[] args) {

        Integer[] arr1 = new Integer[]{4, 3, 6, -3, 29, 52, 7, 8, 10, -1, 92};
        System.out.println("Original Array: ");
        for (int num: arr1){
            System.out.print(num + " ");
        }
        try{
            sortBy(arr1, "asc");
            System.out.println("Ascend sorted array: ");
            for (int num: arr1){
                System.out.print(num + " ");
            };
        }
        catch (Exception e) {
            System.out.println(e);
        }
        Integer[] arr2 = new Integer[]{4, 3, 6, -3, 29, 52, 7, 8, 10, -1, 92};
        System.out.println("Original Array: ");
        for (int num: arr2){
            System.out.print(num + " ");
        }
        try{
            sortBy(arr2, "desc");
            System.out.println("Descend sorted array: ");
            for (int num: arr2){
                System.out.print(num + " ");
            };
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }

    public static Integer[] sortBy(Integer[] arr, String order) throws Exception {
        if (!(order == "asc" || order == "desc")){
            throw new Exception("invalid order");
        }
        else if (order == "asc"){
            Arrays.sort(arr);
        }
        else {
            Arrays.sort(arr, Collections.reverseOrder());
            ;        }

        return arr;
    }
}

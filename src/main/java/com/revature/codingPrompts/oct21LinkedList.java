package com.revature.codingPrompts;

import java.util.LinkedList;

public class oct21LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(10);
        list1.add(12);
        list1.add(15);
        list1.add(11);
        list1.add(20);
        list1.add(8);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(7);
        list2.add(3);
        list2.add(20);
        list2.add(8);

        System.out.println(Intersection(list1, list2));


    }


    public static <T> Object Intersection (LinkedList<T> list1, LinkedList<T> list2){
        int start1 = Math.max(list1.size()-list2.size(), 0);
        int start2 = Math.max(list2.size()-list1.size(), 0);
        int length = Math.min(list1.size(), list2.size());

        for(int i = 0; i < start1; i++){
            list1.removeFirst();
        }
        for (int i = 0; i < start2; i++){
            list2.removeFirst();
        }
        for (int i = 0; i < length; i++){
            Object one = list1.getFirst();
            Object two = list2.getFirst();
            if (one == two){
                return one;
            }
            list1.removeFirst();
            list2.removeFirst();
        }
        return null;

    }






}

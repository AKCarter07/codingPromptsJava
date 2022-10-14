package com.revature.codingPrompts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class oct14 {
    public static void main(String[] args) {
        LinkedList<String> listOne = new LinkedList<>();
        LinkedList<String> listTwo = new LinkedList<>();
        LinkedList<String> listThree = new LinkedList<>();
        LinkedList<String> circleOne = new LinkedList<>();
        LinkedList<String> circleTwo = new LinkedList<>();

        listOne.addAll(Arrays.asList("one", "two", "three", "purple", "five", "orange", "seven"));
        listTwo.addAll(Arrays.asList("pepper", "simple", "purple", "cover", "tent", "bengal", "tortoise"));
        listThree.addAll(Arrays.asList("oleander", "cramps", "one", "vice", "the sin of pi is always 0", "but cake is the sin of gluttony", "cream"));

        System.out.println(intersects(listOne, listTwo));
        System.out.println(intersects(listThree, listTwo));
        System.out.println(intersects(listOne, listThree));

        circleOne.addAll(Arrays.asList("1", "2", "3", "4", "2"));
        circleTwo.addAll(Arrays.asList("1", "2", "3", "4", "5"));

        System.out.println("circular reference: " + isCircle(circleOne));
        System.out.println("circular reference: " + isCircle(circleTwo));

    }
    public static boolean intersects(LinkedList listOne, LinkedList listTwo){
        boolean intersects = false;
        for (int i = 0; i < listOne.size(); i++){
            for (int j = 0; j < listTwo.size(); j++){
                if (listOne.get(i) == listTwo.get(j)){
                    intersects = true;
                    break;
                }
                if (intersects){
                    break;
                }
            }
        }
        return intersects;
    }

    public static Object isCircle(LinkedList test){
        Object ref = null;
        List<Object> tested = new ArrayList<>();
        for (int i = 0; i < test.size(); i++){
            if (tested.contains(test.get(i))){
                ref = test.get(i);
                break;
            } else {
                tested.add(test.get(i));
            }
        }
        return ref;
    }
}

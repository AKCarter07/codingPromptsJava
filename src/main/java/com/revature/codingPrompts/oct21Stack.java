package com.revature.codingPrompts;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

class NoElements extends Exception{
    public NoElements(String message){
        super(message);
    }
}

public class oct21Stack {
    List vector;
    int numItems;

    public oct21Stack() {
        vector = new Vector();
        numItems = 0;
    }

    public void push (Object val){
        vector.add(val);
        numItems++;
    }

    public <T> Object pop(){
        try {
            Object last = vector.get(numItems-1);
            vector.remove(numItems-1);
            numItems--;
            return last;
        }
        catch(Exception e){
            return "No elements in array";
        }

    }
    public <T> Object max(){
        try {
            return Collections.max(vector);
        }
        catch(Exception e){
            return "No elements in array";
        }
    }

    public static void main(String[] args){

        oct21Stack stack = new oct21Stack();
        System.out.println(stack.max());
        stack.push(21);
        stack.push(32);
        stack.push(18);
        System.out.println(stack.max());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.max());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}

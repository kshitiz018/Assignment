package com.company.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackUsingLinkedList<T> {
    public LinkedList<T> list = new LinkedList<>();
    public void push(T e){
        this.list.add(e);
    }
    public T pop(){
        if (this.list.size()>0){
            T e = list.get(list.size()-1);
            list.remove(list.size()-1);
            return e;
        }
        throw new EmptyStackException();
    }
    public boolean isEmpty(){
        return this.list.size() == 0;
    }


    public static void main(String[] args) {
        StackUsingLinkedList<String> stack = new StackUsingLinkedList<>();
        stack.push("OOP");
        stack.push("Algorithms");
        stack.push("Data Structures");
        try {
            while (true){
                System.out.println("Popped "+ stack.pop());
            }
        }
        catch (EmptyStackException e){
            System.out.println("Done");
        }


    }
}

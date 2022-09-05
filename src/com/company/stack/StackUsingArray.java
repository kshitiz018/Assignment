package com.company.stack;

import java.util.EmptyStackException;

public class StackUsingArray<T> {
    T[] arr;
    int capacity;
    int index;

    public StackUsingArray(int capacity) {
        this.capacity=capacity;
        arr = (T[]) new Object[capacity];
        index = -1;
    }

    public boolean isEmpty(){
        return index == -1;
    }
    public boolean isFull(){
        return index ==this.capacity-1;
    }
    public void push(T data){
        if (isFull()){
            throw new StackOverflowError("stack is already full");
        }
        this.arr[++index] = data;
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return this.arr[index--];
    }


    public static void main(String[] args) {
        StackUsingArray<String> stackUsingArray = new StackUsingArray<>(5);
        System.out.println("is Empty "+ stackUsingArray.isEmpty());
        stackUsingArray.push("Kshitiz");
        stackUsingArray.push("Sharma");
        System.out.println("is Empty "+stackUsingArray.isEmpty());
        System.out.println(stackUsingArray.pop());
        System.out.println(stackUsingArray.pop());


    }
}

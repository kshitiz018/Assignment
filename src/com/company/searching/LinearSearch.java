package com.company.searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements : ");
        for (int i=0;i<arr.length;i++){
            arr[i]= input.nextInt();
        }
        System.out.print("Enter the key : ");
        int key = input.nextInt();
        int index = search.binarySearch(arr , key);
        if (index == -1){
            System.out.println("Number "+key+ " can't be found in the array");
        }
        else {
            System.out.println("Number "+key +" is found at index : "+ index);
        }
    }

    public int binarySearch(int arr[], int key){

        for (int i=0;i< arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}

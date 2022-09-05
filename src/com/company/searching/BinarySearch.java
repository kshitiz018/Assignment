package com.company.searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
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
        int left = 0;
        int right = arr.length-1;
        search.binarySearch(arr, key, left, right);
    }

    public void binarySearch(int arr[], int key, int left, int right){
        int mid = (left+right)/2;
        //base condition
        if (left>right){
            System.out.println("Number "+ key + " can't be found in the array");
        }
        if (key==arr[mid]){
            System.out.println("Number id found at index "+mid);
        }
        else if (arr[mid]>key){
            binarySearch(arr, key, left, mid-1);
        }
        else {
            binarySearch(arr, key, mid+1, right);
        }

    }

}
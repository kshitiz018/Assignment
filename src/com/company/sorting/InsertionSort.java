package com.company.sorting;

import java.util.Scanner;
//in Insertion sort, you compare an element with the element to its left. If the element to its left is greater,
// then we should shift the greater element to the right by one position and the smaller one to the left
public class InsertionSort {
    public static void insertionSort(int arr[]){
        for (int i =1;i< arr.length;i++){
            int v = arr[i];
            int j =i;
            while (j>=1 && arr[j-1]>v){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] =v;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= input.nextInt();
        }
        insertionSort(arr);
        System.out.println("Sorted array");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

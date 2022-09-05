package com.company.sorting;

import java.util.Scanner;

public class SelectionSort {
    //in Selection sort at the end of each iteration, pushes the next highest number to the end.
    // As compare to Bubble sort, this time, it is done with fewer swaps.
    // Selection sort also has a time complexity of O(N2).it performs fewer swaps than Bubble sort
    static void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            // Swap the found minimum element with the first element of the unsorted array
            swap(i,min,arr);

        }
    }
    public static void swap(int i, int min, int arr[]) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
    static void print(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        sort(arr);
        print(arr);


    }

}


package com.company.sorting;

public class QuickSort {

    public static void quickSort(int arr[], int start, int end){
        if (start<end){
            int p = partition(arr, start,end);
            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start;
        for (int j =start;j<end;j++) {
            if (arr[j] <= pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp2 = arr[i];
        arr[i] = arr[end];
        arr[end] = temp2;
        return i;
    }

    public static void printArray(int arr[]){
        for (int i =0; i< arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
        int array[] = {10,7,9,1,5};
        quickSort(array,0, array.length-1);
        printArray(array);

    }
}

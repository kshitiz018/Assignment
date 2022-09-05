package com.company.sorting;

import java.util.Arrays;

//Bubble sort has a time complexity of O(N2)
public class BubbleSort {
    public static int[] bubbleSort(int[] numbers){
        int n = numbers.length;
        for (int i=0;i<n;i++){
            for (int j=1;j<n-i;j++){
                if (numbers[j-1]>numbers[j]){
                    swap(j-1,j,numbers);
                }
            }
        }
        return numbers;
    }
    //swap method
    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] args) {
        int[] randomNumbers = {13,342,23,2351,352,3915,123,32,1,5,0};
        int[] sortedNumbers;
        sortedNumbers = bubbleSort(randomNumbers);
        System.out.print("The sorted order is : ");
        System.out.println(Arrays.toString(sortedNumbers));


    }
}


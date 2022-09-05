package com.company.sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);

            merge(numbers, first, mid, last);
        }
        return numbers;
    }
    private static int[] merge(int[] numbers, int first, int mid, int last) {
        int l = first; //initial index of first subarray
        int r = mid + 1; // initial index of second subarray
        int k = 0; // initial index of merged array
        int[] t = new int[numbers.length];
        while (l <= mid && r <= last) {
            if (numbers[l] <= numbers[r]) {
                t[k] = numbers[l];
                k++;
                l++;
            } else {
                t[k] = numbers[r];
                k++;
                r++;
            }
        }
        // Copy the remaining elements on left half , if there are any
        while (l <= mid) {
            t[k] = numbers[l];
            k++;
            l++;
        }
        // Copy the remaining elements on right half , if there are any
        while (r <= last) {
            t[k] = numbers[r];
            k++;
            r++;
        }
        // Copy the remaining elements from array t back the numbers array
        l = first;
        k = 0;
        while (l <= last) {
            numbers[l] = t[k];
            l++;
            k++;
        }
        return numbers;
    }
    public static void main(String args[]) {
        int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 67, 5, 9};
        int first = 0;
        int last = randomNumbers.length-1;
        System.out.println(Arrays.toString(mergeSort(randomNumbers, first,last)));
    }
}

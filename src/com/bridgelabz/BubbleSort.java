package com.bridgelabz;

import java.util.Arrays;

public class BubbleSort {

    //Main method to print the before and after sorting array
    public static void main(String args[]) {
        int unsorted[] = {4, 15, 21, 2, 75, 10, 68};
        bubbleSort(unsorted); //Applying Bubble sort to sort the Array
        System.out.println("");
        System.out.println("Array after applying Bubble Sort: ");
        System.out.print(Arrays.toString(unsorted));
    }

    public static void bubbleSort(int[] unsorted) {
        System.out.println("unsorted array before sorting is as follows : " + Arrays.toString(unsorted));

        // Outer loop - need n-1 iteration to sort n elements
        for (int i = 0; i < unsorted.length - 1; i++) {

            //Inner loop to perform the comparison and swapping between adjacent numbers
            //After each iteration one index from last is sorted
            for (int j = 1; j < unsorted.length - i; j++) {

                //If the current number is greater then swap those two
                if (unsorted[j - 1] > unsorted[j]) {
                    int temp = unsorted[j - 1];
                    unsorted[j - 1] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
    }
}


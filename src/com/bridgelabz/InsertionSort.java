package com.bridgelabz;

import java.util.Arrays;

public class InsertionSort {

    //insertionSort method to sort the string array
    public static void insertionSort(Comparable[] wordArray) {
        for (int i = 1; i < wordArray.length; i++) {
            Comparable wordsToSort = wordArray[i];
            int j = i;
            while (j > 0 && wordArray[j - 1].compareTo(wordsToSort) > 1) {
                wordArray[j] = wordArray[j - 1];
                j--;
            }
            wordArray[j] = wordsToSort;
        }
    }

    //Main method to print the unsorted and sorted array of words using insertion sort
    public static void main(String[] args) {
        System.out.println("");
        String[] Words = {"Space", "Earth", "Sun", "Moon", "Universe", "World"};
        System.out.println("String array before sorting : " + Arrays.toString(Words));
        insertionSort(Words);
        System.out.println("String array after sorting : " + Arrays.toString(Words));
    }
}



package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
    public static void main(String[] args) {
        //Taking input from user to take how many words
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of words you wish to input: ");
        int n = sc.nextInt();
        String[] words = new String[n];

        //Enter the word until the user want
        System.out.println("Enter the words");
        for (int i = 0; i < words.length; i++) {
            System.out.print("WORD " + (i + 1) + ": ");
            words[i] = sc.next();
        }

        System.out.println("enter the word you want to search for");
        String word = sc.next();

        //Sorting the words using array
        Arrays.sort(words);

        //Printing found if word found else not found is printed
        if (Arrays.binarySearch(words, word) >= 0) {
            int index = Arrays.binarySearch(words, word);
            System.out.println(" Word " + word + " found at position = " + index);
        } else {
            System.out.println("Word not found in the list");
        }
    }
}

package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {

        //Scanner to take input from user and toLowerCase to convert both the strings to lowercase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String string1 = scanner.next();
        string1 = string1.toLowerCase();
        System.out.println("Enter second string: ");
        String string2 = scanner.next();
        string2 = string2.toLowerCase();

        //If the sorted strings are equal then print both the strings are equal else not anagram is printed
        if (isAnagram(string1, string2)) {
            System.out.println("Both the strings are Anagram");
        } else {
            System.out.println("Both the strings are not Anagram");
        }
    }

    public static boolean isAnagram(String string1, String string2) {

        //To get length of both the strings
        int length1 = string1.length();
        int length2 = string2.length();

        //If length of both the strings is not same then they are not anagram
        if (length1 != length2)
            return false;

        //Convert into character array
        char[] ch1 = string1.toCharArray();
        char[] ch2 = string2.toCharArray();

        //Sorting both character strings
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //Comparing sorted strings
        for (int i = 0; i < length1; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }
}



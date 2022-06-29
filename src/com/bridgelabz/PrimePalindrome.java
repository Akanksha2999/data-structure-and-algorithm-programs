package com.bridgelabz;

import java.util.Scanner;

public class PrimePalindrome {
    int lowerLimit, upperLimit, reverse, count;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        lowerLimit = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        upperLimit = sc.nextInt();
    }

    void primePalindrome() {
        int num, temp, i;
        for (num = lowerLimit; num <= upperLimit; num++) {
            count = 0;
            reverse = 0;
            temp = num;

            //Checking for prime number
            for (i = 1; i <= temp; i++) {
                //counting the number of factors of the number
                if (temp % i == 0)
                    count++;
            }

            //If the number is prime then will check for palindrome
            if (count == 2) {
                //Reverse the number
                while (temp > 0) {
                    reverse = reverse * 10 + (temp % 10);
                    temp /= 10;
                }

                //Checking if the reverse number is same as number
                if (reverse == num)
                    System.out.println(num + " ");
            }
        }
    }

    //Main method
    public static void main(String[] args) {
        PrimePalindrome primePalindrome = new PrimePalindrome();
        primePalindrome.accept();
        System.out.println("The prime palindrome numbers are: ");
        primePalindrome.primePalindrome();
    }
}
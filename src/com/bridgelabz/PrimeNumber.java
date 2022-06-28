package com.bridgelabz;

public class PrimeNumber {
    public static void main(String[] args) {

        //Initializing lower and upper limit
        int lower = 2, upper = 1000;

        //If the number is prime print the number
        System.out.println("The prime numbers between 0 to 1000 are:");
        for (int i = lower; i <= upper; i++)
            if (isPrime(i) == true)
                System.out.println(i);
    }

    static boolean isPrime(int n) {

        // 0, 1 and negative numbers are not prime numbers
        if (n < 2)
            return false;

        // checking the number is prime or not
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        // if reached here then must be prime number
        return true;
    }
}

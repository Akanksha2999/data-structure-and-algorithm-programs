package com.bridgelabz;

public class PermutationString {

    //Main method to print all the possible permutation's of the string
    public static void main(String[] args) {
        String string = "WORLD";
        int n = string.length();
        PermutationString permutationString = new PermutationString();
        System.out.println("All the permutation of the String WORLD is as follows: ");
        System.out.println("");
        permutationString.permute(string, 0, n - 1);
    }

    //Permute method to calculate all the permutations

    private void permute(String string, int start, int end) {
        if (start == end)
            System.out.println(string);
        else {
            for (int i = start; i <= end; i++) {
                string = swap(string, start, i);
                permute(string, start + 1, end);
                string = swap(string, start, i);
            }
        }
    }

    //Swap method to swap the character at position
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

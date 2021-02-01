package com.bitwise_operations;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String letters = scanner.nextLine();
        int maxLen = 0;

        // Check all single letter center points
        for (int i = 0; i < letters.length(); i++) {
            maxLen = Math.max(maxLen, PalindromeLen(letters, i, i));
        }

        // Check all double letter center points
        for (int j = 0; j < letters.length() - 1; j++){
            maxLen = Math.max(maxLen, PalindromeLen(letters, j, j + 1));
        }
        System.out.println(maxLen);
    }

    private static int PalindromeLen(String letters, int leftIndex, int rightIndex) {
        while (leftIndex >= 0 && rightIndex < letters.length()
                && letters.charAt(leftIndex) == letters.charAt(rightIndex)) {
            leftIndex--;
            rightIndex++;
        }
        return rightIndex - leftIndex - 1;
    }
}

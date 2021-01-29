package com.bitwise_operations;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) throws Exception {

	// BINARY TO DECIMAL CONVERTER
        System.out.println("Convert from BINARY to DECIMAL");
        System.out.print("Enter a number in binary format: ");

        Scanner scan = new Scanner(System.in);
        String inputNumber = scan.nextLine();

        int sum = 0;
        int magnitude = 1;

        for (int i = inputNumber.length() - 1; i >= 0; i--) {
            int digit = inputNumber.charAt(i) - '0';
            sum = sum + digit * magnitude;
            magnitude = magnitude * 2;
        }

        System.out.println("The decimal number representation is: " + sum);

    // DECIMAL TO BINARY CONVERTER
        System.out.println();
        System.out.println("Convert from DECIMAL to BINARY");
        System.out.print("Enter a number in decimal format: ");
        int number = Integer.parseInt(scan.nextLine());
        String result = "";

        while (number > 0) {
            int decimal = number % 2;
            result = decimal + result;
            number = number / 2;
        }

        System.out.println("The decimal number representation is: " + result);

        // HEXADECIMAL TO DECIMAL CONVERTER
        System.out.println();
        System.out.println("Convert from DECIMAL to HEXADECIMAL");
        System.out.print("Enter a number in decimal format: ");
        Scanner scannner = new Scanner(System.in);
        int input = Integer.parseInt(scannner.nextLine());
        String resultt = "";

        while (input > 0) {
            int decimal = input % 16;
            resultt = getHexDigit(decimal) + resultt;
            input = input / 16;
        }

        System.out.println("The hexadecimal number representation is: " + resultt);
    }

    private static String getHexDigit(int decimal) throws Exception {
        if (decimal < 10) {
            return "" + decimal;
        } else if (decimal == 10) {
            return "A";
        } else if (decimal == 11) {
            return "B";
        } else if (decimal == 12) {
            return "C";
        } else if (decimal == 13) {
            return "D";
        } else if (decimal == 14) {
            return "E";
        } else if (decimal == 15) {
            return "F";
        } else {
            throw new Exception("Invalid digit!");
        }
    }
}

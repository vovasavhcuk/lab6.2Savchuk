package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = in.nextLine();
        System.out.println("=======================");
        CheckForBraces checkForBraces = new CheckForBraces();
        CheckForDigits checkForDigits = new CheckForDigits();
        System.out.println("Check for braces:\n");
        if(!checkForBraces.check(str)){
            System.out.println("String: \"" + str + "\" is invalid");
        }else{
            System.out.println("String: \"" + str + "\" is valid");
        }
        System.out.println("Check for digits:\n");
        if(!checkForDigits.check(str)){
            System.out.println("String: \"" + str + "\" is invalid");
        }else{
            System.out.println("String: \"" + str + "\" is valid");
        }

    }
}

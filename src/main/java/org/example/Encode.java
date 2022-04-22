package org.example;

import java.util.Scanner;

public class Encode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any text you'd want us to encode:");
        String userText = sc.nextLine();
        System.out.println("Your text is: " + userText );
    }
}
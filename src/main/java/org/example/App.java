package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Encode encode = new Encode(3);
//        Decode decode = new Decode(3);
        System.out.println("Enter text you'd like encoded here. ONLY USE LETTERS OF THE ALPHABET");
        String userInputtedText = sc.nextLine();
        String codedText = encode.getUserText(userInputtedText);
        System.out.println("Text to be encoded: " + codedText);
//        String answer = decode.getUserPlainTextText(codedText);
//        System.out.println("Your encoded message is: " + answer);
    }
}

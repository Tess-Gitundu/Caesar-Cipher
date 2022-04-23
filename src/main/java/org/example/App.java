package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Encode encode = new Encode(3);
        Decode decode = new Decode(3);
        System.out.println("Enter text you'd like encoded here. ONLY USE LETTERS OF THE ALPHABET");
        String userInputtedText = sc.nextLine();
        String codedText = encode.getUserText(userInputtedText.toUpperCase());
        System.out.println("Inputted message " + codedText);
        String answer = decode.getUserPlainTextText(codedText);
        System.out.println("Encrypted String: " + answer);
        System.out.println("Decrypted String: " + userInputtedText);

    }
}

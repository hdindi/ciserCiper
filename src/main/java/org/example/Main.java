package org.example;

import java.util.Scanner;

// Press Ctrl+Alt+L to format the code.
// Press Ctrl+Alt+O to optimize imports.

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! Cipher Scanner platform : ");

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text you want to encrypt: ");
        String text = scanner.nextLine();
        System.out.println("Enter the shift value: ");
        int shift = scanner.nextInt();
        System.out.println("Enter the text you want to decrypt: ");
        String endcryptedText = scanner.nextLine();
        System.out.println("Enter the shift value: ");
        int shift2 = scanner.nextInt();

        System.out.println("Encrypted text: " + encrypt(text, shift));
        System.out.println("Decrypted text: " + decrypt(endcryptedText, shift2));

    }


    public static String encrypt(String text, int shift) {
        // Check if the text is an empty String or null and return it if true.
        if (text == null || text.isEmpty() || shift <= 0) {
            return text;
        }

        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int start = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - start + shift) % 26 + start));
            } else {
                result.append(c);
            }
        }



        return result.toString();
    }

    public static String decrypt(String endcryptedText, int shift) {
        return encrypt(endcryptedText, 26 - shift);
    }
}
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
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
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
}
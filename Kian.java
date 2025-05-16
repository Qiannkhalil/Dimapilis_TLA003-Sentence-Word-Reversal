package com.mycompany.kian;

import java.util.*;

/**
 *
 * @author Students Account
 */
public class Kian {

    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = can.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("No input provided.");
            can.close();
            return;
        }

        String[] words = sentence.split("\\s+");
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) {
                reversed.append(" ");
            }
        }

        System.out.println("Reversed sentence:");
        System.out.println(reversed.toString());

    }
}

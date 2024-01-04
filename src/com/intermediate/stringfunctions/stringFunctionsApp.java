package com.intermediate.stringfunctions;

import java.util.Scanner;

public class stringFunctionsApp {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String inputText = keyboardInput.nextLine();

       // inputText=null; // will cause NullPointerException

        if ("Paris".equals("Paris")) {
            System.out.println("Paris was typed in");
        } else {
            System.out.println("The text was " + inputText);
        }

        if (inputText.equalsIgnoreCase("Paris")) {
            System.out.println("Paris was typed in");
        } else {
            System.out.println("The text was " + inputText);
        }

        if (inputText.contains("Par")) {
            System.out.println("The input text contains Par");
        }

        if (inputText.isEmpty()) {
            System.out.println("The input was empty");
        }

        System.out.println("The input text length is: " + inputText.length());
        System.out.println("The input text with uppercase: " + inputText.toUpperCase());
        System.out.println("The input text with lowercase: " + inputText.toLowerCase());

        if (inputText.startsWith("P") || inputText.endsWith("P")) {
            System.out.println("The input text starts or ends with P");
        }

        System.out.println("The replaced text: " + inputText.replace("N","D"));
    }
}

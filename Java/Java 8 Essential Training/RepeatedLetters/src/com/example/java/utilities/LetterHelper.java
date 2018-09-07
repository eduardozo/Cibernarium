package com.example.java.utilities;

import java.util.Scanner;

public class LetterHelper {

    public boolean isConsonant(Character letter) {
        String consonants = "bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ";
        return consonants.contains(letter.toString());
    }

    public boolean isVowel(Character letter) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(letter.toString());
    }

    public void printCharToString(char[] chars) {
        String s = "[";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
            s += (i != (chars.length - 1)) ? ", " : "";
        }
        s += "]";
        System.out.println(s);
    }

    public char[] getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        return string.toCharArray();
    }

}

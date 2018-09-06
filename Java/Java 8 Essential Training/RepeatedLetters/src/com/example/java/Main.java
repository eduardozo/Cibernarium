package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //----------------[ Fase 1 ]----------------
        System.out.println("--- Fase #1 ---");
        char[] name = getInput("Enter your name:");
        printCharToString(name);
        System.out.println();
        //System.out.println(Arrays.toString(name));

        //----------------[ Fase 2 ]----------------
        System.out.println("--- Fase #2 ---");
        List<String> consonantsAndVowels = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        for (Character letter : name) {
            list.add(letter);
            if (isVowel(letter)) {
                consonantsAndVowels.add("Vowel");
            } else if (isConsonant(letter)) {
                consonantsAndVowels.add("Consonant");
            } else {
                System.out.println("People's name just contains Vowels and Consonants");
                System.err.println(letter);
            }
        }
        System.out.println(consonantsAndVowels);
        System.out.println(list);
        System.out.println();

        //----------------[ Fase 3 ]----------------
        System.out.println("--- Fase #3 ---");
        Map<Character, Integer> letterList = new HashMap<>();
        for (Character letter: name) {
            letterList.put(letter, 0);
        }

        for (Character letter : name) {
            letterList.merge(letter, 1, Integer::sum);
            //letterList.replaceAll((key, value) -> (letter.equals(key)) ? value += 1 : 0);
        }

        /*for (Character letter : name) {
            int count = 0;
            for (int i = 0; i < name.length; i++) {
                if (letter.equals(name[i])) {
                    count++;
                }
            }
            letterList.put(letter, count);
        }*/
        System.out.println(letterList);
        System.out.println();

        //----------------[ Fase 4 ]----------------
        System.out.println("--- Fase #4 ---");
        char[] lastname = getInput("Enter your lastname: ");
        List<String> fullName = new ArrayList<>();

        for (Character letter : name) {
            fullName.add(letter.toString());
        }
        fullName.add(" ");
        for (Character letter : lastname) {
            fullName.add(letter.toString());
        }

        System.out.println(fullName);
        System.out.println();
    }


    private static boolean isConsonant(Character letter) {
        String consonants = "bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ";
        return consonants.contains(letter.toString());
    }

    private static boolean isVowel(Character letter) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(letter.toString());
    }

    private static void printCharToString(char[] chars) {
        String s = "[";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
            s += (i != (chars.length - 1)) ? ", " : "";
        }
        s += "]";
        System.out.println(s);
    }

    private static char[] getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        return string.toCharArray();
    }
}

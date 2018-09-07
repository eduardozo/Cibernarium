package com.example.java;

import com.example.java.utilities.LetterHelper;

import java.util.*;

public class RepeatedLetters {

    public static void main(String[] args) {

        RepeatedLetters repeatedLetters = new RepeatedLetters();
        repeatedLetters.showConsole();
    }

    private void showConsole() {
        LetterHelper helper = new LetterHelper();
        //----------------[ Fase 1 ]----------------
        System.out.println("--- Fase #1 ---");
        char[] name = helper.getInput("Enter your name:");
        helper.printCharToString(name);
        System.out.println();
        //System.out.println(Arrays.toString(name));

        //----------------[ Fase 2 ]----------------
        System.out.println("--- Fase #2 ---");
        List<String> consonantsAndVowels = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        for (Character letter : name) {
            list.add(letter);
            if (helper.isVowel(letter)) {
                consonantsAndVowels.add("Vowel");
            } else if (helper.isConsonant(letter)) {
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
        for (Character letter : name) {
            letterList.put(letter, 0);
        }

        //ForEach Lambda
        letterList.forEach((k, v) -> {
            for (Character letter : name) {
                if (k.equals(letter)) {
                    v++;
                }
            }
            letterList.put(k, v);
        });

        /*for (Character letter : name) {
            letterList.computeIfPresent(letter, (k, v) -> v + 1);
        }*/

        /*for (Character letter : name) {
            letterList.merge(letter, 1, Integer::sum);
        }*/



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
        char[] lastname = helper.getInput("Enter your lastname: ");
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

}

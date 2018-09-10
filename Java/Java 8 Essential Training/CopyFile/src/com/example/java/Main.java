package com.example.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "files/loremipsum.txt";
        String targetFile = "file/target.txt";

        try (
                FileReader fileReader = new FileReader(sourceFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(targetFile)
                ) {

            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    fileWriter.write(line + "\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

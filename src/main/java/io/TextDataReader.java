package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextDataReader implements DataReader{


    @Override
    public int countStrings(String source) {
        List<String> allLines = new ArrayList<>();
        try {
            allLines = Files.readAllLines(Paths.get(source));
        } catch (IOException e) {
            System.out.println("Exception while reading from file: " + source + " . Ex: " + e.getMessage());
        }

        int totalWords = 0;

        for (String s: allLines) {
            String[] totalWordsinLine = s.split(" ");
            totalWords = totalWords + totalWordsinLine.length;
        }

        return totalWords;
    }

    @Override
    public int countSpecialSigns(String source) {
        List<String> allLines = new ArrayList<>();
        try {
            allLines = Files.readAllLines(Paths.get(source));
        } catch (IOException e) {
            System.out.println("Exception while reading from file: " + source + " . Ex: " + e.getMessage());
        }


        int specialSigns = 0;

        for (String s: allLines) {
            int lengthWithoutSpecChar = s.replaceAll("[$&+,:;=?@#|'<>.-^*()%!]","").length();
            int lengthOfString = s.length();
            int specialSignsPerLine = lengthOfString - lengthWithoutSpecChar;
            specialSigns = specialSignsPerLine + specialSigns;
        }

        return specialSigns;
    }

    @Override
    public int findWordFrequency(String source) {
        return 0;
    }

}

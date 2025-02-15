package com.essur;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static List<String> readNumbersFromFile(String filename) {
        List<String> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(line.trim());
            }
        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу: " + e.getMessage());
        }
        return numbers;
    }
}

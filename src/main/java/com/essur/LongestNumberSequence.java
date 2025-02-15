package com.essur;

import javax.swing.*;
import java.io.File;
import java.util.List;

import static com.essur.FileReader.readNumbersFromFile;
import static com.essur.NumberPuzzle.findLongestSequence;

public class LongestNumberSequence {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue != JFileChooser.APPROVE_OPTION) {
            System.err.println("Файл не було вибрано.");
            return;
        }

        File selectedFile = fileChooser.getSelectedFile();
        List<String> numbers = readNumbersFromFile(selectedFile.getAbsolutePath());
        String connected = findLongestSequence(numbers);

        System.out.println("Результат: " + connected);
        System.out.println(connected.length());
    }
}
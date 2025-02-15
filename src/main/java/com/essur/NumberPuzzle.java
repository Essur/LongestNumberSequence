package com.essur;

import java.util.*;

public class NumberPuzzle {
    public static String findLongestSequence(List<String> numbers) {
        List<String> usedNumbers = new ArrayList<>();
        StringBuilder longest = new StringBuilder();

        for (String start : numbers) {
            Set<String> visited = new HashSet<>();
            StringBuilder sequence = new StringBuilder(start);
            visited.add(start);

            while (true) {
                String lastTwo = sequence.substring(sequence.length() - 2);
                Optional<String> next = numbers.stream()
                        .filter(n -> !visited.contains(n) && n.startsWith(lastTwo))
                        .findFirst();

                if (next.isPresent()) {
                    sequence.append(next.get().substring(2));
                    visited.add(next.get());
                } else {
                    break;
                }
            }

            if (sequence.length() > longest.length()) {
                longest = sequence;
                usedNumbers.clear();
                usedNumbers.addAll(visited);
            }
        }

        return longest.toString();
    }
}

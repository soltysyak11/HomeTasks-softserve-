package com.softserve.edu16.pt.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        var lines = Files.lines(Path.of("C:/Users/Asus/Downloads/pg1777.txt"))
                .toArray(String[]::new);
        Arrays.stream(lines)
                .map(String::length)
                .limit(10)
                .forEach(System.out::println);

        Arrays.stream(lines)
                .max(Comparator.comparing(String::length))
                .ifPresent(e -> System.out.println("The longest line is '" + e + "'"));

        Arrays.stream(lines)
                .filter(e -> e.length() > 3)
                .min(Comparator.comparing(String::length))
                .ifPresent(e -> System.out.println("The shortest line is '" + e + "'"));

        Arrays.stream(lines)
                .filter(e -> e.contains("var"))
                .forEach(System.out::println);
    }

    }

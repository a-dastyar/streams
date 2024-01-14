package com.campus;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        /*
         * Streams from collections
         */
        List.of(1, 2, 3, 4, 5)
                .stream()
                .forEach(System.out::println);

        Set.of(1, 2, 3, 4, 5)
                .stream()
                .forEach(System.out::println);

        /*
         * Streams from iterators
         */
        Stream.generate(List.of(1, 2, 3, 4, 5).iterator()::next)
                .limit(5)
                .forEach(System.out::println);

        /*
         * Streams from arrays
         */
        Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
                .forEach(System.out::println);

        Arrays.stream(new String[] { "1", "2", "3", "4", "5" })
                .forEach(System.out::println);

        Stream.of(new int[] { 1, 2, 3, 4, 5 })
                .forEach(System.out::println);

        /*
         * Stream generators
         */
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);

        LongStream.rangeClosed(1, 5)
                .forEach(System.out::println);

        Stream.<Integer>generate(new Random()::nextInt)
                .limit(5)
                .forEach(System.out::println);

        /*
         * Manual stream initialization
         */
        Stream.of(1, 2, 3, 4, 5)
                .forEach(System.out::println);

        Stream.builder().add(1).add(2).add(3).build()
                .forEach(System.out::println);

        Stream.empty();

        /*
         * Other ways
         */
        "This is a string".chars()
                .mapToObj(i -> (char) i)
                .forEach(System.out::println);
    }
}
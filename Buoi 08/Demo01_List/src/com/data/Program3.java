package com.data;

import java.util.HashSet;
import java.util.Set;

public class Program3 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(15);
        numbers.add(8);

        System.out.println("Set number sau khi add lần 1:");
        System.out.println(numbers);

        numbers.add(20);
        System.out.println("Set number sau khi add lần 2:");
        System.out.println(numbers);

        numbers.forEach(integer -> {
            System.out.println(integer);
        });
    }
}

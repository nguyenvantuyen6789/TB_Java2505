package com.data;

import java.util.ArrayList;
import java.util.List;

public class Program5Lamda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(4);
        numbers.add(8);

        // filter: lọc ra theo điều kiện
        // vd: lấy ra các số lẻ
        List<Integer> result1 = numbers.stream().filter(obj -> obj % 2 == 1)
                .toList();
        System.out.println("List số lẻ:");
        System.out.println(result1);
        // vd: lấy ra các số lẻ và > 10
        List<Integer> result2 = numbers.stream()
                .filter(obj -> obj % 2 == 1 && obj > 10)
                .toList();
        System.out.println("List số lẻ và > 10:");
        System.out.println(result2);

        System.out.println("=== Đếm số phẩn tử trong list:");
        int size = numbers.size();
        System.out.println("=== Size list number: " + size);

        long size2 = numbers.stream().count();
        System.out.println("=== Size2 list number theo stream: " + size2);

        System.out.println("=== Đếm số phẩn tử chẵn trong list:");
        long size3 = numbers.stream().filter(obj -> obj % 2 == 0)
                .count();
        System.out.println("=== Size3 số lượng phần tử chẵn: " + size3);
    }
}

package com.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Nhập 10 phần tử vào list:");

        List<Integer> listData = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1) + ":");
            int tmp = sc.nextInt();
            listData.add(tmp);
        }
        System.out.println("=== List sau khi nhập:");
        System.out.println(listData);

        for (int i = 0; i < listData.size(); i++) {
            if (listData.get(i) % 3 == 0) {
                listData.remove(i);
            }

        }
        System.out.println("=== List sau xoá các phần tử:");
        System.out.println(listData);
    }
}

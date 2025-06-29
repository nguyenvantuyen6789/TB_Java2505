package com.data;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        // tạo 1 mảng trống, lưu số
        List<Integer> listNumber = new ArrayList<>();
        System.out.println("Size mảng trống: " + listNumber.size());
        listNumber.add(15);
        listNumber.add(8);
        System.out.println("Size sau khi add: " + listNumber.size());
        // 2 phần tử có index: 0, 1
        // => lấy index 0 là ra phần tử đầu tiên(15)
        // => lấy index 1 là ra phần tử thứ 2 (8)
        // => lấy index 2 là ra phần tử thứ 3 (=> lỗi, vì k tồn tại)
        Integer value1 = listNumber.get(0);
        System.out.println("Value: " + value1);

        // in toàn bộ
        System.out.println("==== in toàn bộ giá trị: for i");
        for (int i = 0; i < listNumber.size(); i++) {
            System.out.println("Value: " + listNumber.get(i));
        }
        System.out.println("==== in toàn bộ giá trị: foreach Java 8+");
        listNumber.forEach(integer -> {
            System.out.println("Du lieu: " + integer);
        });

        // thêm số 8 nữa vào
        // => [15, 8, 8]
        listNumber.add(8);
        System.out.println("== listNumber");
        System.out.println(listNumber);

        System.out.println("== Xoá đi phần tử đầu tiên");
        listNumber.remove(0);
        System.out.println("== Kết quả sau khi Xoá đi phần tử đầu tiên");
        System.out.println(listNumber);

        // tạo ra 1 list số: tính tổng các số chẵn và in ra có bao
        // nhiêu số chẵn
        // sv thực hành

    }
}

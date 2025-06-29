package com.data;

public class Program {
    public static void main(String[] args) {
        // Giá trị ban đầu: int i = 0
        // i < 2: Đúng
        // Gia tri i: 0
        // i++: i = 1
        for (int i = 0; i < 5; i++) {
            System.out.println("Gia tri i: " + i);
            System.out.println("Gia tri i^2: " + (i * i));
        }
    }
}

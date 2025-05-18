package com.data;

public class Program6 {
    public static void main(String[] args) {
        // Bài 6: Viết chương trình in ra các số chẵn và
        // chia hết cho 3 trong khoảng từ 1 -> 1000 bằng while
        int number = 1;

        // cách khác
//        while (number % 6 == 0) {
        while (number <= 1000) {
            if (number % 2 == 0 && number % 3 == 0) {
                System.out.println("Số đó là: " + number);
            }
            number++;
        }
    }
}

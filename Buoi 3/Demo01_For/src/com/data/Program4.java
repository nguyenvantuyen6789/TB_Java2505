package com.data;

public class Program4 {
    public static void main(String[] args) {
        // bt4: in ra các số chẵn trong khoảng 1 - 50
        // nhưng bỏ khoảng 32-42 đi
        // sv làm trong 10 rồi chữa

        for (int i = 1; i < 50; i++) {
            if (i % 2 !=0){
                if (i < 32 || i > 42) {
                    System.out.println(i);
                }
            }
        }
    }
}

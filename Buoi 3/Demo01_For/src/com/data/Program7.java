package com.data;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị n:");
        int n = sc.nextInt();

        String sym = "*";
        for (int i = 1; i <= n; i++) {
            System.out.println(sym);
            sym = sym + " *";
        }
    }
}

package com.data;

import java.util.Scanner;

// ChuongTrinh: Pascal case
public class Program9 {
    public static void main(String[] args) {
        // level 1
        // nhập 3 cạnh và in ra chu vi
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cạnh thứ nhất:");
        double canh1 = sc.nextDouble();

        System.out.println("Nhập cạnh thứ 2:");
        double canh2 = sc.nextDouble();

        System.out.println("Nhập cạnh thứ 3:");
        double canh3 = sc.nextDouble();

        double chuVi = canh1 + canh2 + canh3;
        System.out.println("Chu vi tam giác: " + chuVi);
    }
}

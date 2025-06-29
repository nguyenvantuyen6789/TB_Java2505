package com.data;

import java.util.Scanner;

// ChuongTrinh: Pascal case
public class Program10 {
    public static void main(String[] args) {
        // level 2
        // nhập 3 cạnh và in ra chu vi, kiểm tra 3 cạnh có phải tam giác không
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cạnh thứ nhất:");
        double canh1 = sc.nextDouble();

        System.out.println("Nhập cạnh thứ 2:");
        double canh2 = sc.nextDouble();

        System.out.println("Nhập cạnh thứ 3:");
        double canh3 = sc.nextDouble();

        // kiểm tra: tổng 2 cạnh bất kỳ > cạnh còn lại mới là 1 tam giác
        if ((canh1 + canh2 > canh3) && (canh1 + canh3 > canh2) && (canh2 + canh3 > canh1)) {
            double chuVi = canh1 + canh2 + canh3;
            System.out.println("Chu vi tam giác: " + chuVi);
        } else {
            System.out.println("3 cạnh trên không thể tạo thành 1 tam giác");
        }
    }
}

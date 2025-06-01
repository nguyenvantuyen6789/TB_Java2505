package com.data;

import java.util.Scanner;

public class DataMang {
    public void tinhMang() {
        System.out.println("Chay trong ham tinh mang");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");

        int n = sc.nextInt();

        // nhap dữ  liệu
        int[] arrNum = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu: " + (i + 1));
            int tmp = sc.nextInt();
            arrNum[i] = tmp;
        }
        // tính tổng
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arrNum[i];
        }

        System.out.println("Tong: " + sum);
    }

    // hàm tính tổng 2 số
    public int tong2So() {
        int a = 12;
        int b = 3;
        int tong = a + b;

        return tong;
    }

    public boolean danhGiaSv() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullName = sc.nextLine();

        System.out.println("Enter score:");
        Double score = sc.nextDouble();

        System.out.println("Enter hanh kiem:");
        sc = new Scanner(System.in);
        String hanhKiem = sc.nextLine();

        if (score >= 7 && (hanhKiem.equals("Kha") || hanhKiem.equals("Tot"))) {
            return true;
        }

        return false;
    }
}

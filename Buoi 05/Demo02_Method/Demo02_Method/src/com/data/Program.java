package com.data;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        HinhTamGiac hinhTamGiac = new HinhTamGiac();
//        double chuVi = hinhTamGiac.tinhChuVi(12, 10, 7);
//
//        System.out.println("Chu vi: " + chuVi);

        // tạo 1 class HinhChuNhat, co phương thức tinh chu vi,
        // dien tich
        // co 2 tham so
        // ham main cho nhap 2 so la 2 canh cua HCN
        // in ra chu vi, dien tich HCN

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        Scanner sc = new Scanner(System.in);
        int cd = sc.nextInt();
        int cr = sc.nextInt();

        int chuVi = hinhChuNhat.getChuVi(cd, cr);
        int dienTich = hinhChuNhat.getDienTich(cd, cr);

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien Tich: " + dienTich);

        // giao vien viet 1 doan code + giai thich: => len git
        // đẩy nhều lần, giúp sv xem lại lịch sử code
        // vd
        // giang ve phep cộng 2 số
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        // tinh nang tiep theo
        // tinh nang thu 3
        // tinh nang thu 4
        // tinh nang thu 5
    }
}

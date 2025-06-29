package com.data;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Success");
        // toán tử +, -, *, /
        // chia lấy dư: %

        int moneyTcb = 120000;
        int moneyVcb = 230000;

        int total = moneyTcb + moneyVcb;
        System.out.println("Total: " + total);

        // Sử dụng Scanner: nhận dữ liệu từ bàn phím
        // nextInt: lấy số
        // nextLine: lấy chuỗi
        // nextDouble: lấy số thực
        // ...
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên:");
        String fullName = sc.nextLine();
        System.out.println("Họ tên vừa nhập: " + fullName);

        // nhập vào 1 số và in ra giá trị gấp 10 lần nó
        System.out.println("Bài1");

        System.out.println("Nhập vào 1 số:");
        // khai báo lại sc để nhập số
//        sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int result1 = num1 * 10;
        System.out.println("số vừa nhập: " + result1);

        // TH1
        // b1: nhập chuỗi
        // b2: nhập số (k cần khai báo lại sc) => OK

        // TH1
        // b1: nhập số
        // b2: nhập chuỗi (k cần khai báo lại sc) => lỗi

        System.out.println("Nhập địa chỉ:");
        sc = new Scanner(System.in);
        String address = sc.nextLine();
        System.out.println(address);

        // chia lấy dư: %
        // 10 chia 4 dư 2
        int result2 = 10 % 4; // 2
        int result3 = 100 % 9; // 1
        int result4 = 4 % 9; //


    }
}

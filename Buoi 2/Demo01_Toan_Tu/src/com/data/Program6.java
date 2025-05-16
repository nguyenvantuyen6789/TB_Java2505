package com.data;

import java.util.Scanner;
// ChuongTrinh: Pascal case
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập thông tin 1 người, họ tên, tuổi, địa chỉ
        // nếu người đó > 30 hoặc địa chỉ Hà Nội thì in ra họ tên
        // nếu không thì in: Chưa đủ điều kiện tham gia

        System.out.println("Nhập họ tên:");
        String hoTen = sc.nextLine();

        System.out.println("Nhập tuổi:");
        int tuoi = sc.nextInt();

        sc = new Scanner(System.in);
        System.out.println("Nhập địa chỉ:");
        String diaChi = sc.nextLine();

        if (tuoi > 30 || diaChi.equals("Ha Noi")) {
            System.out.println("Đủ điều kiện tham gia");
        } else {
            System.out.println("Không đủ điều kiện tham gia");
        }
    }
}

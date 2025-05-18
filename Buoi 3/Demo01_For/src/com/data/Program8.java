package com.data;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        // in ra menu

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị menu:");
        int menu = sc.nextInt();

        // tạo ra biến isOk = true
        while (menu < 1 || menu > 4) {
            System.out.println("Giá trị menu chưa đúng, nhập 1 - 4.");
            System.out.println("Nhập giá trị menu:");
            menu = sc.nextInt();
        }

//        if (menu == 1) {
//            System.out.println("1: Bạn đang vào chức năng login");
//        } else if (menu == 2) {
//            System.out.println("2: Bạn đang vào chức năng Xem Sản Phẩm");
//        } else if (menu == 3) {
//            System.out.println("3: Bạn đang vào chức năng Xem Profile");
//        } else if (menu == 4) {
//            System.out.println("4: Bạn đang vào chức năng Logout");
//        }
        switch (menu) {
            case 1:
                System.out.println("1: Bạn đang vào chức năng login");
                break;
            case 2:
                System.out.println("2: Bạn đang vào chức năng Xem Sản Phẩm");
                break;

        }
    }
}

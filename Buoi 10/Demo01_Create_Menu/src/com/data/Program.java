package com.data;

import com.data.connection.ConnectionDB;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // thực hành tạo menu
        System.out.println("==== Chương trình quản lý điện thoại ====");
        System.out.println("1. Quản lý điện thoại");
        System.out.println("2. Quản lý khách hàng");
        System.out.println("3. Quản lý hoá đơn");
        System.out.println("4. Quản lý doanh thu");
        System.out.println("5. Đăng xuất");

        System.out.println("====");
        System.out.println("Nhập chức năng tương ứng:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n < 1 || n > 5) {
            System.out.println("Số chức năng chưa đúng!. Vui lòng nhập lại:");
            n = sc.nextInt();
        }

        switch (n) {
            case 1:
                System.out.println("=== Chức năng Quản lý điện thoại");
                ProductDAOImpl.getListProduct();
                break;
            case 2:
                System.out.println("Chức năng Quản lý khách hàng");
                break;
            case 3:
                System.out.println("Chức năng Quản lý hoá đơn");
                break;
            case 4:
                System.out.println("Chức năng Quản lý doanh thu");
                break;
            default:
                System.out.println("Chức năng Đăng xuất");
        }
    }
}

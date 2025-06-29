package com.data;

import java.util.Locale;
import java.util.Scanner;

// ChuongTrinh: Pascal case
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập tài khoản
        System.out.println("Nhập tài khoản:");
        String account = sc.nextLine();
        System.out.println("account");
        System.out.println(account.toLowerCase());

        // nhập mật khẩu
        System.out.println("Nhập mật khẩu:");
        String password = sc.nextLine();

        if (account.toLowerCase().equals("admin") && password.equals("123456")) {
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Username hoặc password không đúng!");
        }

    }
}

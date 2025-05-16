package com.data;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        // kiểm tra số có lớn hơn 100 k, và thông báo ra
        // b1: nhập 1 số từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số từ bàn phím:");
        int num1 = sc.nextInt();
        // b2: kiểm tra number > 100
        if (num1 > 100) {
            System.out.println("Giá trị lớn hơn 100, OK!");
        } else {
            // ngược lại
            System.out.println("Giá trị không lớn hơn 100, OK!");
        }
        // b3: in ra thông báo

    }
}

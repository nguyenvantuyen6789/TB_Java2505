package com.data;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số:");
        int num2 = sc.nextInt();
        if (num2 > 0) {
            System.out.println("Số vừa nhập vào là số dương");
        } else if(num2 < 0) {
            System.out.println("Số vừa nhập vào là số âm");
        } else {
            System.out.println("Số 0 không âm, không dương");
        }
    }
}

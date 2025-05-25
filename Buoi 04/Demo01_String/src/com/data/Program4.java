package com.data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        // nhập mảng và in ra giá lớn nhất của mảng
        System.out.println("Nhap so luong phan tu cua mang:");
        Scanner sc = new Scanner(System.in);
        // inputN có thể là chuỗi hoặc số
        String inputN = sc.nextLine();
        // nếu code trong try lỗi => nhảy sang catch
        int n = 0;
        while (true) {
            try {
                // parse int để chuyển đổi chuỗi "5" về số 5
                n = Integer.parseInt(inputN);
                System.out.println("N: " + n);

                break;
            } catch (Exception ex) {
                System.out.println("gia tri n khong phai so");
                System.out.println("Vui long nhap lai n!");
            }
        }
        // tạo mảng n phần tử
        int[] arrNum = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            arrNum[i] = sc.nextInt();
        }

        // lấy max
        int max = arrNum[0];
        for (int i = 1; i < n; i++) {
            if (max < arrNum[i]) {
                max = arrNum[i];
            }
        }

        System.out.println("Gia tri max lon nhat: " + max);
    }
}

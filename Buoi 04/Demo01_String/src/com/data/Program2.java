package com.data;

public class Program2 {
    public static void main(String[] args) {
        // mảng
        int[] arrNumber = new int[7];

        // mới khai báo: các phần tử giá trị 0
        System.out.println("Phan tu dau tien: " + arrNumber[0]);
        System.out.println("Phan tu thu 4: " + arrNumber[3]);
        // set giá trị
        arrNumber[0] = 5;
        arrNumber[1] = 8;
        arrNumber[2] = 2;
        arrNumber[3] = 15;
        arrNumber[4] = 9;
        arrNumber[5] = 6;
        arrNumber[6] = 1;
        // in giá trị, dựa vào index
        System.out.println("Phan tu dau tien: " + arrNumber[0]);
        System.out.println("Phan tu thu 4: " + arrNumber[3]);
        // for để in mảng
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Phan tu " + (i + 1) + ": " + arrNumber[i]);
        }
        // sv in ra ket qua
    }
}

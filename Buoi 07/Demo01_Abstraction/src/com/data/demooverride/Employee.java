package com.data.demooverride;

public class Employee extends Boss {

    // phương thức tính tiền của employee đã ghi đè
    // tính tiền của ông chủ
    public void tinhTien(int luongCung, int thuong) {
        int soTien = luongCung + thuong * 2;

        System.out.println("So tien: " + soTien);
    }
    // nếu k ghi đè tinhTien, thì theo hàm tinhTien
    // của ông chủ

    public void tinhTong(int a, int b) {

        System.out.println("Tong: " + (a + b));
    }

    // overload: là các hàm cùng tên, khác sl tham số
    // overload: là các hàm cùng tên, cùng sl tham số
    //              nhưng khác kiểu dữ liệu

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public String sum(String ho, String ten) {
        return "Ho va ten: " + ho + " " + ten;
    }
}

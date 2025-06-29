package com.data;

public class Program2 {
    public static void main(String[] args) {
        DataMang dataMang = new DataMang();
//        dataMang.tinhMang();

//        int result = dataMang.tong2So();
//        System.out.println("Result: " + result);
        // làm xong chụp zalo

        // thực hành:
        // tạo 1 hàm (tra ve boolean) nhap vao ho ten, diem trung binh
        // hanh kiem,
        // neu diem trung binh >= 7 va hanh kiem kha hoac tot
        // tra ve true, con nguoc lai tra ve false

        boolean result2 = dataMang.danhGiaSv();
        System.out.println("result2: " + result2);

        if (result2) {
            System.out.println("Sv du dieu kien len lop");
        } else {
            System.out.println("Sv bi dup, khong the len lop");
        }
    }
}

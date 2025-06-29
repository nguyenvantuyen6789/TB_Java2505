package com.data.demooverride;

public class Program2 {
    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        e1.tinhTien(5000000, 1500000);
//
//        Boss e2 = new Employee();
//        e2.tinhTien(3000000, 1200000);

        Employee e3 = new Employee();
        int result = e3.sum(10, 15);
        System.out.println("result: " + result);
        int result2 = e3.sum(10, 15, 17);
        System.out.println("result2: " + result2);
    }
}

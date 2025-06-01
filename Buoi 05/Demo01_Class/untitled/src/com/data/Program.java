package com.data;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();
        person.fullName = "Nguyen Ngoc";
        person.address = "HN";
        person.phone = "0977777888";
        person.money = 1100;

        System.out.println("Full Name: " + person.fullName);
        System.out.println("Address: " + person.address);
        System.out.println("Phone: " + person.phone);
        System.out.println("Money: " + person.money);

        // in dùng toString
        System.out.println(person);

        // hàm toString: Giúp in đối tượng nhanh hơn

        // tạo person khác
        Person p2 = new Person();
        p2.fullName = "Pham Thang";
        p2.address = "HP";
        p2.phone = "0966111222";
        p2.money = 1400;
        // in
        System.out.println(p2);

        // su dụng show email
        Person p3 = new Person();
        p3.showEmail();

        // tạo 1 method để nhập vào 1 mảng số nguyên, rồi in ra tổng giá trị mảng số đó
        // gọi trong hàm main
        // sv làm trong 10p, khó thì hỏi nhé
    }
}

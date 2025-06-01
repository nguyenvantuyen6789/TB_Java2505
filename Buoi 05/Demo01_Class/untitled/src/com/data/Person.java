package com.data;

import java.util.Scanner;

public class Person {
    public String fullName;

    public String address;

    public String phone;

    public int money;

    // tạo method
    public void showEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email:");
        String email = sc.nextLine();

        System.out.println("Email: " + email);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", money=" + money +
                '}';
    }
}

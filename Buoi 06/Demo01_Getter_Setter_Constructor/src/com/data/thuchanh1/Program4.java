package com.data.thuchanh1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full name:");
        student.fullName = sc.nextLine();

        System.out.println("Enter gender:");
        student.gender = sc.nextLine();

        System.out.println("Enter address:");
        student.address = sc.nextLine();

        System.out.println("Enter birthday:");
        String tmpBirthday = sc.nextLine(); // 2005-01-30 14:30:00

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date birthday = sdf.parse(tmpBirthday);

        student.birthday = birthday;

        System.out.println("Enter Id:");
        sc = new Scanner(System.in);
        student.id = sc.nextInt();

        System.out.println("Enter diem trung binh:");
        student.diemTrungBinh = sc.nextInt();

        System.out.println("Enter email:");
        student.email = sc.nextLine();

        System.out.println("==== Thong tin student da nhap:");
        System.out.println(student);

        if (student.diemTrungBinh >= 8) {
            System.out.println("CHuc mung! Ban dat duoc hoc bong!");
        } else {
            System.out.println("Rat tiec! ban chua dat duoc hoc bong");
        }
    }
}

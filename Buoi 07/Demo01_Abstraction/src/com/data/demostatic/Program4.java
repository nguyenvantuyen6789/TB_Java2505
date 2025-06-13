package com.data.demostatic;


public class Program4 {
    public static void main(String[] args) {
        Student2 st1 = new Student2();
        st1.studentName = "Ngoc";
        Student2.schoolName = "THPT Phạm Hùng";

        System.out.println("St1 name: " + st1.studentName);
        System.out.println("St1 school Name: " + st1.schoolName);

        Student2 st2 = new Student2();
        st2.studentName = "Nam";

        System.out.println("St2 name: " + st2.studentName);
        System.out.println("St2 school Name: " + st2.schoolName);

        st2.schoolName = "Trần hưng Đạo";

        System.out.println("==== ");
        System.out.println("St2 name: " + st2.studentName);
        System.out.println("St2 school Name: " + st2.schoolName);

        System.out.println("==== ");
        System.out.println("St1 name: " + st1.studentName);
        System.out.println("St1 school Name: " + st1.schoolName);
    }
}

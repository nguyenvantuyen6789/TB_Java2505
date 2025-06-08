package com.data.demointerface;

public class Program3 {
    public static void main(String[] args) {
        // c1
        Student st1 = new Student();
        st1.showStudent();

        // c2
        IStudent st2 = new Student();
        st2.showStudent();
    }
}

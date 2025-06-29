package com.data;

public class Program {
    public static void main(String[] args) {
        Student st = new Student();
        // c1: tạo full name theo property
        st.fullName = "Nguyen Ngoc";
        System.out.println("Full name1: " + st.fullName);

        Student st2 = new Student();
        // c2: set giá trị dùng setter
        // lấy giá trị bằng getter
        st2.setFullName("Trần Nam");
        System.out.println("Full name2: " + st2.getFullName());
    }
}

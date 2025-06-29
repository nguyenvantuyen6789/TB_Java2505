package com.data;

public class Program11 {
    public static void main(String[] args) {
        // hàm xử lý chuỗi
        String courseName = "Java core with Database";
        // length: lấy độ dài
        int len = courseName.length();
        System.out.println("Độ dài chuỗi: " + len);

        String result2 = courseName.substring(0, 2);
        System.out.println("result2: " + result2);

        String result3 = courseName.substring(3, 6);
        System.out.println("result3: " + result3);
        // hàm replace: thay thế chuỗi
        String result4 = courseName.replaceAll("a", "e");
        System.out.println("result4: " + result4);

//        courseName.to
    }
}

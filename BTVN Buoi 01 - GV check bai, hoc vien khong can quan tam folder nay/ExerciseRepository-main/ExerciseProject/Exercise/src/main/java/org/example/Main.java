package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Bài 1
//        System.out.println("Bài 1:");
//        bai1();
        //Bài 2
//        System.out.println("Bài 2:");
//        bai2();
        //Bài 3
//        System.out.println("Bài 3:");
//        bai3(1, 2);
//        //Bài 4
//        System.out.println("Bài 4:");
//        bai4(true, false, true);
        //Bài 5
//        System.out.println("Bài 5:");
//        bai5();
//        //Bài 6
//        System.out.println("Bài 6:");
//        bai6();
        //Bài 7
        System.out.println("Bài 7:");
        bai7();
    }

    public static void bai2() {
        int a = 10;
        int b = 5;
        System.out.println("a=" + a + " và b=" + b);
        System.out.println("Tổng 2 số a+b =" + (a + b));
        System.out.println("Hiệu 2 số a-b =" + (a - b));
        System.out.println("Tích 2 số a*b =" + (a * b));
        System.out.println("Thương 2 số a*b =" + (a / b));
        System.out.println("Số dư khi chia số a cho b =" + (a % b));
    }

    public static void bai3(int x, int y) {
        System.out.println("x==y :" + (x == y));
        System.out.println("x!=y :" + (x != y));
        System.out.println("x>y :" + (x > y));
        System.out.println("x>y :" + (x > y));
        System.out.println("x<y :" + (x < y));
        System.out.println("x>=y :" + (x >= y));
        System.out.println("x<=y :" + (x <= y));
    }

    public static void bai4(boolean a, boolean b, boolean c) {
        String result1 = (a && b) ? "Cả hai giá trị a và b đều đúng" : "Hoặc a sai hoặc b sai";
        String result2 = (a || b) ? "Trong a và b có ít nhất 1 giá trị đúng" : "Cả 2 giá trị a và b đều sai";
        String result3 = !c ? "Phủ định của c là đúng" : "Phủ định của c là sai";
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static void bai5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài:");
        double width = scanner.nextDouble();
        System.out.print("Nhập chiều rộng:");
        double height = scanner.nextDouble();
        System.out.println("Diện tích :" + (width * height));
        System.out.println("Chu vi :" + ((width + height) * 2));
    }

    public static void bai7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giờ ban đầu:");
        int gio1 = scanner.nextInt();
        System.out.print("Nhập phút ban đầu:");
        int phut1 = scanner.nextInt();
        System.out.print("Nhập giây ban đầu:");
        int giay1 = scanner.nextInt();
        System.out.print("Nhập giờ cộng thêm: ");
        int gio2 = scanner.nextInt();
        System.out.print("Nhập phút cộng thêm: ");
        int phut2 = scanner.nextInt();
        System.out.print("Nhập giây cộng thêm: ");
        int giay2 = scanner.nextInt();
        int tonggiay1 = gio1 * 3600 + phut1 * 60 + giay1;
        int tonggiay2 = gio2 * 3600 + phut2 * 60+giay2;
        int tonggiay=tonggiay1+tonggiay2;
        int giokq=tonggiay/3600;
        int phutkq=(tonggiay%3600)/60;
        int giaykq=tonggiay%60;
        System.out.printf("Thời gian sau khi cộng: %02d:%02d:%02d\n", giokq, phutkq, giaykq);

    }

    public static void bai6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------Nhập thông tin sinh viên---------");
        System.out.println("Nhập tên sinh viên:");
        String ten = scanner.nextLine();
        System.out.println("Nhập điểm môn học 1:");
        double diem1 = scanner.nextDouble();
        System.out.println("Nhập điểm môn học 2:");
        double diem2 = scanner.nextDouble();
        System.out.println("Nhập điểm môn học 3:");
        double diem3 = scanner.nextDouble();
        System.out.println("----------Hiển thị thông tinh sinh viên---------");
        System.out.println("Tên sinh viên: " + ten);
        System.out.println("Điểm môn 1: " + diem1 + " | Điểm môn 2: " + diem2 + " | Điểm môn 3: " + diem3);
        double diemtrungbinh = (diem1 + diem2 + diem3) / 3;
        System.out.printf("Điểm trung bình: %.2f\n", (diemtrungbinh));
        System.out.println("Đánh giá: " + (diemtrungbinh >= 5 ? "Lên lớp" : "Học lại"));
    }

    public static void bai1() {
        int a = 10;
        double db = 5.35;
        char ch = 'c';
        String str = "abc";
        System.out.println("Gía trị của biến a =" + a);
        System.out.println("Gía trị biến db =" + db);
        System.out.println("Gía trị biến ch =" + ch);
        System.out.println("Gía trị biến str =" + str);
    }
}

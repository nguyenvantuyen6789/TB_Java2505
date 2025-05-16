package com.data;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào điểm toán:");
        double diemToan = sc.nextDouble();

        System.out.println("Nhập vào điểm lý:");
        double diemLy = sc.nextDouble();

        System.out.println("Nhập vào điểm hoá:");
        double diemHoa = sc.nextDouble();

        double diemTB = (diemToan + diemLy + diemHoa) / 3;

        if (diemTB >= 8) {
            System.out.println("Điểm TB sv: " + diemTB + ". Học lực: Giỏi");
        } else if (diemTB >= 6.5) {
            System.out.println("Điểm TB sv: " + diemTB + ". Học lực: Khá");
        } else if (diemTB >= 5) {
            System.out.println("Điểm TB sv: " + diemTB + ". Học lực: Trung Bình");
        } else {
            System.out.println("Điểm TB sv: " + diemTB + ". Học lực: Yếu");
        }

    }
}

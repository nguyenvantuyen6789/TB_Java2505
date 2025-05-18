package com.data;

public class Program10 {
    public static void main(String[] args) {
        // toán tử 3 ngôi
        String address = "HCM";

//        int maXe = -1;
//        if (address.equals("HN")) {
//            maXe = 29;
//        } else {
//            maXe = 0;
//        }
//        System.out.println(maXe);

        // nếu address là HN, thì mã xe là 29, nếu không thì mã xe là 0
        int maXe = address.equals("HN") ? 29 : 0;
        System.out.println("maXe: " + maXe);

    }
}

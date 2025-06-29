package com.data.constructor;

public class Program {
    public static void main(String[] args) {
        // tạo 1 đối tượng order data, dùng hàm khởi tạo k tham số
        OrderData orderData = new OrderData(2, "HP", "Nam");

        // tạo 1 đối tượng order data, dùng hàm khởi tạo có tham số
        OrderData orderData2 = new OrderData(1, "HN", "Ngoc");
        // in thông tin khách hàng
        System.out.println("Id: " + orderData2.getId());
        System.out.println("Address: " + orderData2.getAddress());
        System.out.println("Customer Name: " + orderData2.getCustomerName());

        // in dung tostring
        System.out.println(orderData2);

        // thực tạo 1 class product: id, product name, price, country
        // tạo getter setter va 2 hàm khởi tạo
        // tao 2dđôi tuong dùng hàm khởi tạo k tham số và set gia tri
        // sử dụng getter setter rồi in ra
        // tao 2dđôi tuong dùng hàm khởi tạo có tham số rồi in ra
        // sv làm trong 15p
    }
}

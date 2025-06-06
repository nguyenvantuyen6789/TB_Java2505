package com.data.constructor;

public class Program {
    public static void main(String[] args) {
        // tạo 1 đối tượng order data, dùng hàm khởi tạo k tham số
        OrderData orderData = new OrderData();

        // tạo 1 đối tượng order data, dùng hàm khởi tạo có tham số
        OrderData orderData2 = new OrderData(1, "HN", "Ngoc");
        // in thông tin khách hàng
        System.out.println("Id: " + orderData2.getId());
        System.out.println("Address: " + orderData2.getAddress());
        System.out.println("Customer Name: " + orderData2.getCustomerName());
    }
}

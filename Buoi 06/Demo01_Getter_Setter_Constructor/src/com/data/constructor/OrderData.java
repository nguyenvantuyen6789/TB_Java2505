package com.data.constructor;

public class OrderData {

    private int id;

    private String address;

    private String customerName;

    // hàm khởi tạo k tham số
    public OrderData() {
        // code chạy ngay khi tạo đối tượng
        System.out.println("Hàm khởi tạo không tham số đã được gọi");
    }

    public OrderData(int id, String address, String customerName) {
        // code chạy ngay khi tạo đối tượng
        System.out.println("Hàm khởi tạo CÓ tham số đã được gọi");

        this.id = id;
        this.address = address;
        this.customerName = customerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

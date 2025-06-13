package com.data.demosuper;

public class Car extends Vehicle {
    public int numSeat;

    public Car() {
        // gọi constructor của super class
        super(); // dùng logic cũ

        // bỏ super: => viết code logic mới

    }

    // id: 2, name:kia
    public Car(int id, String name, int numSeat) {
        super(id, name);
        this.numSeat = numSeat;
    }
}

package com.data.kethua;

public class Car extends Vehicle {
    // chưa kế thừa: có 1 thuộc tính: numSeat
    public int numSeat;
    // sau khi kế thừa Vehicle: có thêm 2 thuộc tính: id, name


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numSeat=" + numSeat +
                ", name='" + name + '\'' +
                '}';
    }
}

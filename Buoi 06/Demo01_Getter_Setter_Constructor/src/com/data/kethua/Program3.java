package com.data.kethua;

public class Program3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.numSeat = 9;
        car1.id = 2;
        car1.name = "Kia morning";

        System.out.println(car1);

        car1.showData();

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);
    }
}

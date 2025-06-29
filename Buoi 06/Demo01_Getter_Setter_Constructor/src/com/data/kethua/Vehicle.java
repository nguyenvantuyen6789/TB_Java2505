package com.data.kethua;

// class xe cộ
public class Vehicle {

    public int id;

    public String name;

    public void showData() {
        System.out.println("xin chao2");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

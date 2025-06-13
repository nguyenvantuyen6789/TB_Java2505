package com.data.demosuper;

public class Vehicle {
    public int id;
    public String name;

    public Vehicle() {
        System.out.println("Vehicle constructor no param");
    }

    // id:2, name: kia
    public Vehicle(int id, String name) {
        System.out.println("Vehicle constructor with param");
        this.id = id;
        this.name = name;
    }
}

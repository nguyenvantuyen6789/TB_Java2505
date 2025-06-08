package com.data.demointerface;

public class Student implements IStudent {

    @Override
    public void showStudent() {
        System.out.println("Name: Ngoc");
        System.out.println("Address: Ha Noi");
    }

}

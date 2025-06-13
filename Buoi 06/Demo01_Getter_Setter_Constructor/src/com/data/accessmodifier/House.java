package com.data.accessmodifier;

public class House {
    public int height;

    private String color;

    protected String address;

    boolean isBig;

    public void showData() {
        height = height * 2;
        System.out.println("height: " + height);
    }

    public void showData2() {
        color = "Blue";
        System.out.println("color: " + color);
    }

    public void showData3() {
        address = "5 Pham Hung";
        System.out.println("address: " + address);
    }

    public void showData4() {
        isBig = true;

        if (isBig) {
            System.out.println("Em chao dai gia");
        } else {
            System.out.println("30 tuoi van chua co nguoi yeu");
        }
    }
}

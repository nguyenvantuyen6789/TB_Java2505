package com.data;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.keu();

        // tạo con mèo
        Animal animal1 = new Cat();
        animal1.keu();

        // hiển thị nơi ở
        animal1.showNoiO();
    }
}

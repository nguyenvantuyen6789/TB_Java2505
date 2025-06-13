package com.data.accessmodifier2;

import com.data.Dog;

public class Program6 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.showData();
//        System.out.println("Xin chào web site chúng tôi  rất vui");

        String str1 = new String("a");
        String str2 = str1;

        System.out.println(str2);
        str1 = new String("mm");

        System.out.println(str2);
    }
}

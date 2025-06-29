package org.example;

public class Program {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        if (a == true && b == true) {
            System.out.println("Cả a và b đều đúng");
        } else {
            System.out.println("Có ít nhất 1 trong 2 giá trị a và b sai");
        }
    }
}

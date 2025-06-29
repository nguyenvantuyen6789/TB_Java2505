package com.data;

public class Program5 {
    public static void main(String[] args) {
        // khi level account < 10 => báo ra ngoài level account quá thấp
        // đánh trận sẽ thua
        // khi mà level account = 10 => level cao
        // đánh đâu thắng đấy
        int levelAccount = 1;
        while (levelAccount < 10) {
            System.out.println("Account level quá thấp => ĐẠI BẠI!");
            System.out.println("Level hiện tại: " + levelAccount);
            levelAccount = levelAccount + 1;
        }

        System.out.println("== Account level = 10 => THẮNG TRẬN!");

    }
}

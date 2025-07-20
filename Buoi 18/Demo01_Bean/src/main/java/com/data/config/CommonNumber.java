package com.data.config;

import com.data.entity.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonNumber {

    public int sum(int a, int b) {
        return a + b;
    }

    @Bean // tạo 1 bean để inject
    // trả về 1 đối tượng Account
    public Account getDataAccount() {
        System.out.println(7);
        Account account = new Account();
        account.setId(10);
        account.setUsername("t10");
        account.setPassword("1");
        account.setFullName("Chien");

        return account;
    }
}

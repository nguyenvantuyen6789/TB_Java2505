package com.data.service;

import com.data.entity.Account;
import com.data.repository.AccountRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // bean lưu trong spring ioc container
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountService {

    @Autowired
    AccountRepository accountRepo; // inject bean thì thuộc tính tạo thành
    // 1 instance

    public List<Account> getAll() {
        List<Account> accounts = accountRepo.findAll();

        return accounts;
    }
}

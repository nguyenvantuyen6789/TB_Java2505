package com.data.controller;

import com.data.config.CommonNumber;
import com.data.entity.Account;
import com.data.repository.AccountRepository;
import com.data.service.AccountService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // tạo bean + nhận http request từ client
@RequestMapping("accounts")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountController {

    @Autowired
    AccountService accountService; // inject bean thì thuộc tính tạo thành

    @Autowired
    AccountRepository accountRepo; // inject bean thì thuộc tính tạo thành
    // 1 instance

    @Autowired
    CommonNumber commonNumber; // inject bean thì thuộc tính tạo thành
    // 1 instance

    @Autowired
    Account account2;

    @GetMapping
    public ResponseEntity<?> getAll() {
        int total = commonNumber.sum(13, 4);
        System.out.println("total");
        System.out.println(total);

        System.out.println("account2");
        System.out.println(account2);

        List<Account> accounts = accountService.getAll();
        System.out.println("Find data by username:");
        List<Account> accounts2 = accountRepo.findByUsername("t1");
        System.out.println(accounts2);

        return ResponseEntity.ok(accounts);
    }

    @GetMapping("get")
    public ResponseEntity<?> getData2() {
        List<Account> accounts2 = accountRepo.getData2("t1", "nam");

        return ResponseEntity.ok(accounts2);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Account account) {
        accountRepo.save(account);

        return ResponseEntity.ok(account);
    }

}

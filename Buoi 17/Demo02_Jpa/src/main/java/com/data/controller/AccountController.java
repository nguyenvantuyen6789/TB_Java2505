package com.data.controller;

import com.data.dto.AccountCreateDTO;
import com.data.dto.AccountUpdateDTO;
import com.data.entity.Account;
import com.data.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired // tự động tạo instance (k cần new AccountRepository)
    private AccountRepository accountRepo;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<Account> accounts = accountRepo.findAll();

        return ResponseEntity.ok(accounts);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        // op account: có thể có hoặc k
        Optional<Account> opAccount = accountRepo.findById(id);
        // check empty
        if (opAccount.isEmpty()) {
            return new ResponseEntity<>("Id not found, id = " + id, HttpStatus.BAD_REQUEST);
        }

        Account account = opAccount.get();

        return ResponseEntity.ok(account);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        Optional<Account> opAccount = accountRepo.findById(id);
        // check empty
        if (opAccount.isEmpty()) {
            return new ResponseEntity<>("Id not found, id = " + id, HttpStatus.BAD_REQUEST);
        }

        Account account = opAccount.get();
        accountRepo.delete(account);

        return ResponseEntity.ok("Delete account success, username = " + account.getUsername());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody AccountCreateDTO accountCreateDTO) {
        Account account = new Account();
        account.setUsername(accountCreateDTO.getUsername());
        account.setPassword(accountCreateDTO.getPassword());
        account.setEmail(accountCreateDTO.getEmail());
        account.setPhone(accountCreateDTO.getPhone());

        // save: Account(id=null) => create
        // save: Account(id=1) => update
        accountRepo.save(account);

        return new ResponseEntity<>(account, HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable int id,
                                    @RequestBody AccountUpdateDTO accountUpdateDTO) {
        Optional<Account> opAccount = accountRepo.findById(id);
        // check empty
        if (opAccount.isEmpty()) {
            return new ResponseEntity<>("Id not found, id = " + id, HttpStatus.BAD_REQUEST);
        }

        Account account = opAccount.get();
        account.setUsername(accountUpdateDTO.getUsername());
        account.setPassword(accountUpdateDTO.getPassword());
        account.setEmail(accountUpdateDTO.getEmail());
        account.setPhone(accountUpdateDTO.getPhone());

        accountRepo.save(account);

        return ResponseEntity.ok("Update account success, username: " + account.getUsername());

    }
}

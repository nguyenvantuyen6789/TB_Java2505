package com.example.demo_thymeleaf.controller;

import com.example.demo_thymeleaf.entity.Account;
import com.example.demo_thymeleaf.service.AccountService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AccountController {

    AccountService accountService;

    @GetMapping("account-list")
    public String findAll(Model model) {
        model.addAttribute("name", "Nguyễn nam");
        model.addAttribute("age", 18);
        model.addAttribute("address", "HN");
        model.addAttribute("birthday", new Date());

        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);

        return "AccountList";
    }

    @GetMapping("account-delete/{id}")
    public String delete(@PathVariable int id) {
        Optional<Account> opAccount = accountService.findById(id);

        if (opAccount.isEmpty()) {
            return "redirect:/account-list";
        }

        accountService.delete(opAccount.get());
        return "redirect:/account-list";
    }

    @GetMapping("account-add")
    public String add() {
        return "AccountAdd";
    }

    @PostMapping("account-save")
    public String save(@RequestParam String username,
                       @RequestParam String password,
                       @RequestParam String fullName) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        account.setFullName(fullName);

        accountService.save(account);

        return "redirect:/account-list";
    }

    @GetMapping("account-edit/{id}")
    public String edit(@PathVariable int id,
                       Model model) {
        Account account = accountService.findById(id).get();
        model.addAttribute("account", account);

        return "AccountEdit";
    }

    @PostMapping("account-update/{id}")
    public String update(@PathVariable int id,
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String fullName) {

        Account account = accountService.findById(id).get();
        account.setUsername(username);
        account.setPassword(password);
        account.setFullName(fullName);

        accountService.save(account);

        return "redirect:/account-list";
    }
}

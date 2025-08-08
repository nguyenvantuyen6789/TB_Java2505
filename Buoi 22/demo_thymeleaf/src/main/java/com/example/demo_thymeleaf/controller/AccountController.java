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
}

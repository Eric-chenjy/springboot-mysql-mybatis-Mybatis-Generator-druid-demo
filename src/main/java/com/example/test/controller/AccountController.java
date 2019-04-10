package com.example.test.controller;

import com.example.test.Service.AccountService;
import com.example.test.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/select/list")
    public List<Account> selectUserList() {
        return this.accountService.selectAccountList();
    }
}

package com.example.test.Service;

import com.example.test.dao.AccountMapper;
import com.example.test.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;
    public List<Account> selectAccountList() {
        return accountMapper.selectAccountList();
    }
}

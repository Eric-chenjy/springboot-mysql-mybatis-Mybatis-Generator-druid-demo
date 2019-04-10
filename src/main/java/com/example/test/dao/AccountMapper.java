package com.example.test.dao;

import com.example.test.entity.Account;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface AccountMapper {
    /**
     * 查詢所有的賬戶信息
     * @return
     */
    public List<Account> selectAccountList();
}
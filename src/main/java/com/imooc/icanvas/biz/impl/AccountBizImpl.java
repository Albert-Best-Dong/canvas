package com.imooc.icanvas.biz.impl;

import com.imooc.icanvas.biz.AccountBiz;
import com.imooc.icanvas.dao.AccountDao;
import com.imooc.icanvas.entity.Account;
import com.imooc.icanvas.global.DaoFactory;

import java.util.List;

public class AccountBizImpl implements AccountBiz {
    private AccountDao accountDao = DaoFactory.getInstence().getDao(AccountDao.class);
    public Account login(String name, String password) {
        List<Account> list = accountDao.selectByName(name);
        for(Account account:list)
            if(account.getPassword().equals(password))
                return account;
        return null;
    }
}

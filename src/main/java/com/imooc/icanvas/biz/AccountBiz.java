package com.imooc.icanvas.biz;

import com.imooc.icanvas.entity.Account;

public interface AccountBiz {
    Account login(String name, String password);
}

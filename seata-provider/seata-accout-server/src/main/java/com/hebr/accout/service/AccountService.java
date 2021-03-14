package com.hebr.accout.service;

/**
 * @author Administrator
 * @class AccountService
 * @date 2021/3/13:11:46
 * @decs TODO
 */
public interface AccountService {

    /**
     * 从用户账户中借出
     */
    void debit(String userId, int money);
}

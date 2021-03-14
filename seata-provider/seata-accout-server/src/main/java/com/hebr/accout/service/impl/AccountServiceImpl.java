package com.hebr.accout.service.impl;

import com.hebr.accout.mapper.AccountMapper;
import com.hebr.accout.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @class AccountServiceImpl
 * @date 2021/3/13:11:47
 * @decs TODO
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;
    @Override
    public void debit(String userId, int money) {

        Integer money1 = accountMapper.getMoney(userId);
        if (money>money1){
            throw new RuntimeException("余额不足");
        }

        accountMapper.debit(userId,money1-money);
    }
}

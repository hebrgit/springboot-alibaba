package com.hebr.accout.controller;

import cloud.common.provider.response.ResponseDto;
import cloud.common.provider.response.ResponseUtils;
import com.hebr.accout.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @class AccountController
 * @date 2021/3/13:11:46
 * @decs TODO
 */
@RestController
@RequestMapping("/v1/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("/debit")
    public ResponseDto debit(@RequestParam("userId") String userId, @RequestParam("money") int money){
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountService.debit(userId,money);
        return ResponseUtils.wrapSuccess();
    }
}

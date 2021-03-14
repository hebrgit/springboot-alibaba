package com.hebr.ordero1.feign;

import cloud.common.provider.response.ResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @class AccountServiceFeign
 * @date 2021/3/13:22:12
 * @decs TODO
 */
@FeignClient(value = "accout-server")
public interface AccountServiceFeign {

    @GetMapping("/v1/account/debit")
     ResponseDto debit(@RequestParam("userId") String userId, @RequestParam("money") int money);
}

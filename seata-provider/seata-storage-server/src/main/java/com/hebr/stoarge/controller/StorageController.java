package com.hebr.stoarge.controller;

import cloud.common.provider.response.ResponseDto;
import cloud.common.provider.response.ResponseUtils;
import com.hebr.stoarge.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @class StorageController
 * @date 2021/3/13:12:06
 * @decs TODO
 */
@RestController
@RequestMapping("/v1/storage")
public class StorageController {

    @Resource
    private StorageService storageService;

    @GetMapping("/deduct")
    public ResponseDto deduct(@RequestParam("commodityCode") String commodityCode,@RequestParam("count") int count){


        storageService.deduct(commodityCode,count);

        return ResponseUtils.wrapException("000000","减库存成功");
    }
}

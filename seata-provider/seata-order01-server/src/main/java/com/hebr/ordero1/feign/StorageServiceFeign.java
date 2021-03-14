package com.hebr.ordero1.feign;

import cloud.common.provider.response.ResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @class StorageServiceFeign
 * @date 2021/3/13:23:36
 * @decs TODO
 */
@FeignClient(value = "storage-server")
public interface StorageServiceFeign {

    @GetMapping("/v1/storage/deduct")
    ResponseDto deduct(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") int count);
}

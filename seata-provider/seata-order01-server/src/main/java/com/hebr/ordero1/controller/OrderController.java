package com.hebr.ordero1.controller;

import cloud.common.provider.response.ResponseDto;
import cloud.common.provider.response.ResponseUtils;
import com.hebr.ordero1.dto.OrderDto;
import com.hebr.ordero1.service.BussinessService;
import com.hebr.ordero1.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @class OrderController
 * @date 2021/3/13:12:01
 * @decs TODO
 */
@RequestMapping("/v1/order")
@RestController
public class OrderController {

    @Resource
    private BussinessService orderService;

    @PostMapping("/create")
    @ApiOperation("创建订单")
    private ResponseDto create(@RequestBody final OrderDto orderDto){
        orderService.purchase(orderDto);
        return ResponseUtils.wrapException("00000","订单创建成功");
    }
}

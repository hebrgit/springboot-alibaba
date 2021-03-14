package com.hebr.ordero1.service.impl;

import com.hebr.ordero1.dto.OrderDto;
import com.hebr.ordero1.feign.StorageServiceFeign;
import com.hebr.ordero1.service.BussinessService;
import com.hebr.ordero1.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @class BussinessServiceImpl
 * @date 2021/3/14:21:27
 * @decs TODO
 */
@Service
@Slf4j
public class BussinessServiceImpl implements BussinessService {


    @Resource
    private StorageServiceFeign storageServiceFeign;

    @Resource
    private OrderService orderService;
    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void purchase(OrderDto orderDto) {


        log.info("减库存-----------------");
        storageServiceFeign.deduct(orderDto.getCommodityCode(),orderDto.getCount());

        orderService.create(orderDto);
    }
}

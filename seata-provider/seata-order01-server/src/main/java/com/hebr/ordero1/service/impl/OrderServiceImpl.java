package com.hebr.ordero1.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.hebr.ordero1.dto.OrderDto;
import com.hebr.ordero1.entity.OrderEntity;
import com.hebr.ordero1.feign.AccountServiceFeign;
import com.hebr.ordero1.feign.StorageServiceFeign;
import com.hebr.ordero1.mapper.OrderMapper;
import com.hebr.ordero1.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;
import java.util.UUID;

/**
 * @author Administrator
 * @class OrderServiceImpl
 * @date 2021/3/13:12:04
 * @decs TODO
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private AccountServiceFeign accountService;

    @Override
    @GlobalTransactional(name = "order-tx",rollbackFor = Exception.class)
    @Transactional(rollbackFor = Exception.class)
    public void create(OrderDto orderDto) {

        OrderEntity order = new OrderEntity();
        BeanUtil.copyProperties(orderDto,order);
        log.info("扣钱-------------------");
        accountService.debit(orderDto.getUserId(), orderDto.getMoney());

        log.info("创建订单---------------");
        orderMapper.insert(order);

    }
}

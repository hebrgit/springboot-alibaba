package com.hebr.ordero1.service;

import com.hebr.ordero1.dto.OrderDto;
import com.hebr.ordero1.entity.OrderEntity;

/**
 * @author Administrator
 * @class OrderService
 * @date 2021/3/13:12:01
 * @decs TODO
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(OrderDto orderDto);
}

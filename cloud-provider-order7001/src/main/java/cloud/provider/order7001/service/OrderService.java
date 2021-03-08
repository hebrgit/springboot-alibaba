package cloud.provider.order7001.service;

import cloud.common.provider.entities.Payment;

/**
 * @author Administrator
 * @class OrderService
 * @date 2021/3/5:21:55
 * @decs TODO
 */
public interface OrderService {

    /**
     * 查询订单
     *
     * @param id
     * @return
     */
    Payment selectOrder(Long id);


    /**
     * 插入订单
     *
     * @param payment
     * @return
     */
    String insertOrder(Payment payment);
}

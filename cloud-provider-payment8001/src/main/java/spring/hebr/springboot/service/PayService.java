package spring.hebr.springboot.service;

import org.apache.ibatis.annotations.Param;
import spring.hebr.springboot.entities.Payment;

public interface PayService {


    /**
     * 创建流水号单据
     *
     * @param payment
     * @return
     */
    boolean createPayment(@Param("payment") Payment payment);

    /**
     * 查询流水号
     *
     * @param id
     * @return
     */
    Payment selectPayment(@Param("id") Long id);
}

package springboot.service;

import cloud.common.provider.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PayService {


    /**
     * 创建流水号单据
     *
     * @param payment
     * @return
     */
    String createPayment(@Param("payment") Payment payment);

    /**
     * 查询流水号
     *
     * @param id
     * @return
     */
    Payment selectPayment(@Param("id") Long id);
}

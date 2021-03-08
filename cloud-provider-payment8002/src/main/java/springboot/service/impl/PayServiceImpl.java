package springboot.service.impl;

import cloud.common.provider.entities.Payment;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import springboot.mapper.PayMapper;
import springboot.service.PayService;


/**
 * @ClassName PayServiceImpl
 * @Author hebo
 * @Date 2021/3/5 17:24
 **/
@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayMapper payMapper;

    @Value("${server.port}")
    private String port;

    @Override
    public String createPayment(final Payment payment) {
        long id = IdWorker.getId();
        payment.setId(id);
        boolean payment1 = payMapper.createPayment(payment);
        if (payment1){
            return "订单创建成功"+port;
        }else {
            return "订单创建失败"+port;
        }
    }

    @Override
    public Payment selectPayment(Long id) {
        Payment payment = payMapper.selectPayment(id);
        payment.setPort(port);
        return payment;
    }
}

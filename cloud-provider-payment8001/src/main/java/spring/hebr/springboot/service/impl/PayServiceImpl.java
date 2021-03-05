package spring.hebr.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hebr.springboot.entities.Payment;
import spring.hebr.springboot.mapper.PayMapper;
import spring.hebr.springboot.service.PayService;

import javax.validation.Payload;

/**
 * @ClassName PayServiceImpl
 * @Author hebo
 * @Date 2021/3/5 17:24
 **/
@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private PayMapper payMapper;
    @Override
    public boolean createPayment(final Payment payment) {
        return payMapper.createPayment(payment);
    }

    @Override
    public Payment selectPayment(Long id) {
        return payMapper.selectPayment(id);
    }
}

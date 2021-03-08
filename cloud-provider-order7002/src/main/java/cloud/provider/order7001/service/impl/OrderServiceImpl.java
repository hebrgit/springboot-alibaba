package cloud.provider.order7001.service.impl;

import cloud.common.provider.entities.Payment;
import cloud.common.provider.response.ResponseDto;
import cloud.provider.order7001.fegin.PaymentFeignService;
import cloud.provider.order7001.service.OrderService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import java.util.LinkedHashMap;

/**
 * @author Administrator
 * @class OrderServiceImpl
 * @date 2021/3/5:21:58
 * @decs TODO
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Payment selectOrder(Long id) {
        return null;
    }

    @Override
    public String insertOrder(Payment payment) {
        return null;
    }

//
//    private static final String URL = "http://localhost:8001";
//    @Resource
//    private RestTemplate restTemplate;
//
//    @Resource
//    private PaymentFeignService feignService;
//
//    @Override
//    public Payment selectOrder(Long id) {
//        ResponseDto responseDto = feignService.selectPayment(id);
//        return JSONObject.parseObject(JSONObject.toJSONString(responseDto.getBody()),Payment.class);
//    }
//
//    @Override
//    public String insertOrder(Payment payment) {
//
//        ResponseDto payment1 = feignService.createPayment(payment);
//
//        return JSONObject.toJSONString(payment1.getBody());
//    }
}

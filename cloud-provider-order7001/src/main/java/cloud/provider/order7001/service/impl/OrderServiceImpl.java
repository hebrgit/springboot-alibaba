package cloud.provider.order7001.service.impl;

import cloud.common.provider.entities.Payment;
import cloud.common.provider.response.ResponseDto;
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

    private static final String URL = "http://CLOUD-PROVIDER-PAYMENT";
    @Resource
    private RestTemplate restTemplate;

    @Override
    public Payment selectOrder(Long id) {
        ResponseEntity<ResponseDto> forEntity = restTemplate.getForEntity(URL + "/v1/payment/selectPayment?id=" + id, ResponseDto.class);
        LinkedHashMap map = (LinkedHashMap) forEntity.getBody().getBody();
        Payment payment = JSONObject.parseObject(JSONObject.toJSONString(map), Payment.class);
        return payment;
    }

    @Override
    public String insertOrder(Payment payment) {

        ResponseEntity<ResponseDto> forEntity = restTemplate.postForEntity(URL + "/v1/payment/createPayment", payment, ResponseDto.class);
        LinkedHashMap map = (LinkedHashMap) forEntity.getBody().getBody();
        String s = JSONObject.parseObject(JSONObject.toJSONString(map), String.class);
        return s;
    }
}

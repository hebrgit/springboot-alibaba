package spring.hebr.springboot.controller;

import cloud.common.provider.response.ResponseDto;
import cloud.common.provider.response.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.hebr.springboot.entities.Payment;
import spring.hebr.springboot.service.PayService;

/**
 * @ClassName PaymentController
 * @Author hebo
 * @Date 2021/3/5 17:26
 **/
@RestController
@RequestMapping("/v1/payment")
public class PaymentController {

    @Autowired
    private PayService payService;

    @PostMapping("/createPayment")
    public ResponseDto createPayment(@RequestBody final Payment payment){

       return ResponseUtils.wrapSuccess(payService.createPayment(payment));
    }

    @GetMapping("/selectPayment")
    public ResponseDto selectPayment(@RequestParam final Long id){

        return ResponseUtils.wrapSuccess(payService.selectPayment(id));
    }
}

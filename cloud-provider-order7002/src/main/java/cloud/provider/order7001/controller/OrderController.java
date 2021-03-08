package cloud.provider.order7001.controller;

import cloud.common.provider.entities.Payment;
import cloud.common.provider.response.ResponseDto;
import cloud.common.provider.response.ResponseUtils;
import cloud.provider.order7001.fegin.PaymentFeignService;
import cloud.provider.order7001.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author Administrator
 * @class OrderController
 * @date 2021/3/5:21:53
 * @decs TODO
 */
@RestController
@RequestMapping("/v1/consumer/order01")
public class OrderController {


    @Resource
    private OrderService orderService;

    @Autowired
    private PaymentFeignService feignService;

    @GetMapping("/selectOrder")
    @ApiOperation("查询订单")
    public ResponseDto selectOrder(@RequestParam("id") Long id) {
        ResponseDto<?> responseDto = feignService.selectPayment(id);
        return responseDto;
    }


    @PostMapping("/insertOrder")
    @ApiOperation("查询订单")
    public ResponseDto selectOrder(@RequestBody Payment payment) {
        return ResponseUtils.wrapSuccess(orderService.insertOrder(payment));
    }


    @GetMapping("/timeout")
    @ApiOperation("超时测试")
    public ResponseDto<?> timeout() {

        ResponseDto<?> timeout = feignService.timeout();
        return timeout;
    }
}

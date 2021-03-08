package cloud.provider.order7001.fegin;

import cloud.common.provider.entities.Payment;
import cloud.common.provider.response.ResponseDto;
import io.swagger.annotations.ApiOperation;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @class PaymentFeginService
 * @date 2021/3/6:20:59
 * @decs TODO
 */
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
@Component
public interface PaymentFeignService {


    @PostMapping("/v1/payment/createPayment")
    @ApiOperation("新增单据")
     ResponseDto createPayment(@RequestBody final Payment payment);


    /***
     * 此处 @RequestParam(value="id") value 值必须加上
     * @param id
     * @return
     */
    @GetMapping("/v1/payment/selectPayment")
    @ApiOperation("查询单据")
     ResponseDto<?> selectPayment(@RequestParam("id") final Long id);

    @GetMapping("/v1/payment/timeout")
    ResponseDto<?> timeout();
}

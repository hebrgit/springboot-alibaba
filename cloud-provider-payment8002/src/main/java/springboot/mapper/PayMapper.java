package springboot.mapper;

import cloud.common.provider.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @ClassName PanyMapper
 * @Author hebo
 * @Date 2021/3/5 16:59
 **/

@Mapper
public interface PayMapper {

    boolean createPayment(Payment payment);

    Payment selectPayment(@Param("id") Long id);
}

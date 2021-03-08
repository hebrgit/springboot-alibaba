package spring.hebr.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import spring.hebr.springboot.entities.Payment;

/**
 * @ClassName PanyMapper
 * @Author hebo
 * @Date 2021/3/5 16:59
 **/

@Mapper
public interface PayMapper {

    boolean createPayment(@Param("payment") Payment payment);

    Payment selectPayment(@Param("id") Long id);
}

package com.hebr.ordero1.mapper;

import com.hebr.ordero1.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @class OrderMapper
 * @date 2021/3/13:12:03
 * @decs TODO
 */
@Mapper
public interface OrderMapper {

    long insert(@Param("order") OrderEntity order);
}

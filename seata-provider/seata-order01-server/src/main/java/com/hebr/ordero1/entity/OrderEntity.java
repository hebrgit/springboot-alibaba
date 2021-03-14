package com.hebr.ordero1.entity;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @class OrderEntity
 * @date 2021/3/13:12:03
 * @decs TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

     private Long id;

     private String userId;

     private String commodityCode;

     private Integer   count;

     private Integer money;

}

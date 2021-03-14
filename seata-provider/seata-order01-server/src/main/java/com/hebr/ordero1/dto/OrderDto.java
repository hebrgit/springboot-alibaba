package com.hebr.ordero1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @class OrderDto
 * @date 2021/3/13:12:02
 * @decs TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Long id;

    private String userId;

    private String commodityCode;

    private Integer   count;

    private Integer money;
}

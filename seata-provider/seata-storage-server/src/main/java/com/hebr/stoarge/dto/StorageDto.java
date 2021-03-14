package com.hebr.stoarge.dto;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Administrator
 * @class StorageDto
 * @date 2021/3/13:12:08
 * @decs TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StorageDto implements Serializable {

    private Long id;

    private String commodityCode;

    private Integer count;
}

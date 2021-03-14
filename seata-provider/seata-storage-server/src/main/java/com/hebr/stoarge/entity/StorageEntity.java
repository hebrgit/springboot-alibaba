package com.hebr.stoarge.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @class StorageEntity
 * @date 2021/3/13:12:09
 * @decs TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StorageEntity {
    private Long id;

    private String commodityCode;

    private Integer count;

}

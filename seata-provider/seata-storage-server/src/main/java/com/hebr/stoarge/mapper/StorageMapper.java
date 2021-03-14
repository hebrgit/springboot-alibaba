package com.hebr.stoarge.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @class StorageMapper
 * @date 2021/3/13:12:08
 * @decs TODO
 */
@Mapper
public interface StorageMapper {
    int getStorageCount(@Param("commodityCode") String commodityCode);

    void deduct(@Param("commodityCode") String commodityCode,@Param("count") int count);
}

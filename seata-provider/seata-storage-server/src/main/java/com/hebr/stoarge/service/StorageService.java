package com.hebr.stoarge.service;

/**
 * @author Administrator
 * @class StorageService
 * @date 2021/3/13:12:07
 * @decs TODO
 */
public interface StorageService {

    /**
     * 扣除存储数量
     *
     */
    void deduct(String commodityCode, int count);
}

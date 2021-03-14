package com.hebr.stoarge.service.impl;

import com.hebr.stoarge.mapper.StorageMapper;
import com.hebr.stoarge.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @class StorageServiceImpl
 * @date 2021/3/13:12:07
 * @decs TODO
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;
    @Override
    public void deduct(String commodityCode, int count) {
        int storageCount = storageMapper.getStorageCount(commodityCode);
        if (count>storageCount){
            throw new RuntimeException("库存不足");
        }
        storageMapper.deduct(commodityCode,storageCount-count);
    }
}

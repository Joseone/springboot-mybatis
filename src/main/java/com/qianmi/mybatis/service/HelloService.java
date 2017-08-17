package com.qianmi.mybatis.service;

import com.qianmi.mybatis.mapper.StoreMapper;
import com.qianmi.mybatis.pojo.StorePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.mybatis.service.HelloService</p>
 * <p>Date: 2017-08-17 15:06.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@Service
public class HelloService {

    @Autowired
    private StoreMapper storeMapper;

    public void getOne(String adminId){
        StorePojo storePojo = storeMapper.getOne(adminId);
        System.out.println(storePojo.getAdminId());
    }
}

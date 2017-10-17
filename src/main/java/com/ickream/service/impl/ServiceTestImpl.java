package com.ickream.service.impl;

import com.ickream.service.ServiceTest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by xf on 2017/9/29.
 */
@Service("serviceTest")
public class ServiceTestImpl implements ServiceTest {

    @Override
    public String hh(){
        System.out.println("-------h----ha");
        return "eeeeeee---";

    }
}

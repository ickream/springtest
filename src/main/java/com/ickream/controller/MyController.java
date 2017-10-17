package com.ickream.controller;


import com.ickream.service.ServiceTest;
import com.ickream.service.impl.ServiceTestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by xf on 2017/9/29.
 */
@Controller
public class MyController {
    @Resource
    private ServiceTest serviceTest;
 //   private ServiceTest serviceTest =new ServiceTestImpl();
  //  @Autowired

    public void controllerTest(){
        System.out.println("controle -----");
        serviceTest.hh();
        System.out.println("after controle -----");
    }
    public ServiceTest getServiceTest(){
        return  this.serviceTest;
    }

}

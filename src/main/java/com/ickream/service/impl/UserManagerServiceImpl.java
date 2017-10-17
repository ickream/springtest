package com.ickream.service.impl;

import com.ickream.service.IUserManagerService;
import org.springframework.stereotype.Service;

/**
 * Created by xf on 2017/10/12.
 */
@Service("iUserManagerService")
public class UserManagerServiceImpl implements IUserManagerService {
    private String name="hhh";

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String findUser(){
        System.out.println("============执行业务方法findUser,查找的用户是"+name+"=============");
        return name;
    }

    public void addUser(){
        System.out.println("===========执行业务方法addUser=============");
        //throw new RuntimeException();
    }
}

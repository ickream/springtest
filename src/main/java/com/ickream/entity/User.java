package com.ickream.entity;

/**
 * Created by xf on 2017/10/15.
 */
public class User {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
}

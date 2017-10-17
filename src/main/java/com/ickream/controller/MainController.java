package com.ickream.controller;

import com.ickream.entity.User;
import com.ickream.service.ServiceTest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xf on 2017/9/27.
 */
@Api("test controller")
@Controller    //RestController 相当于responseBody +Controller
public class MainController {
    @Resource
    private ServiceTest serviceTest;
    private int a=1;
    @ApiOperation(value = "根据用户id查询用户信息", httpMethod = "GET")
    @RequestMapping("/hello")
    public String hello(String testId ,String ttestId){
        serviceTest.hh();
        a++;
        System.out.println("-----------------------"+testId+"-------"+ttestId+"======="+a);

        return "index";
    }

    @ApiOperation(value = "查询用户信息", httpMethod = "GET",produces = "application/json")
    //@ApiResponse(code = 200, message = "success", response = User.class)
    @RequestMapping("/hello/haha")
    @ResponseBody            //标志返回一个json对象
    public List<User> helloByhh(@RequestParam String testI ){
        a++;
        System.out.println("-----------------------"+testI+"-------"+a);
        User user=new User();
        user.setAge(25);
        user.setName("haw");
        List<User> list=new ArrayList<User>();
        list.add(user);
        return list;
    }
    @RequestMapping("/hello/{subname}")
    @ApiOperation(value = "---------last", httpMethod = "GET")
    @ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "zhenshizheyangma")
    public String hi(@PathVariable String subname){
        System.out.println("-----------------------"+subname);
        return "page2";
    }

}

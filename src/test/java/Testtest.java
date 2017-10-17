/**
 * Created by xf on 2017/9/28.
 */
//import com.ickream.MyTest;
//import com.ickream.service.ServiceTest;
import com.ickream.controller.MainController;
import com.ickream.controller.MyController;
import com.ickream.service.ServiceTest;
import org.junit.Before;
import org.junit.Test;
//import com.ickream.controller.*;
//import com.ickream.controller.MainController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring.xml"})
public  class Testtest   {
//    @Resource
//    private ServiceTest serviceTest;
//
//    @Resource
//    private MyController myController;
//
//    @Before
//    public void setUp(){
////        test=new MyTest("hh");
////
////        System.out.println("before test---"+test.getT());
//        System.out.println("----------ye---");
//        serviceTest.hh();
//        myController.controllerTest();
//        //myController=new MyController();
//    }
    @Test
    public void setT(){
        System.out.println("----------ye");
       // myController.controllerTest();
    };

}

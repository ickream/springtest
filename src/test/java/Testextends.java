import com.ickream.controller.MainController;
import com.ickream.controller.MyController;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by xf on 2017/10/10.
 */
public class Testextends extends Testtest {
    @Resource
    private MyController myController;
    @Resource
    private MainController mainController;
    @Test
    public void setMyController(){
        //myController.controllerTest();
        mainController.hello("e","aaa");
    }
    @Test
    public void test01(){
        String s0="helloworld";
        String s1="helloworld";
        String s2="hello"+"world";
        System.out.println("===========test3============");
        System.out.println(s0==s1); //true 可以看出s0跟s1是指向同一个对象
        System.out.println(s0==s2); //true 可以看出s0跟s2是指向同一个对象

        String str3=new String("aaa");
        String str4=new String("aaa");
        System.out.println("===========test2============");
        System.out.println(str3==str4);//false 可以看出用new的方式是生成不同的对象

        String str1="abc";
        String str2="def";
        String str53=str1+str2;
        System.out.println("===========test5============--");
        System.out.println((str53=="abcdef")); //false
    }
}

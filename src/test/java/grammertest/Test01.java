package grammertest;

import org.junit.Test;

import java.lang.management.ManagementPermission;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xf on 2017/10/16.
 */
public class Test01 {
    private String var1="sa";
    List<String> list=new ArrayList<String>();
    @Test
    public void foo(){
        String var1="dd";
        list.add(new String("ss"));
        System.out.println(var1+new ArrayList<String>().getClass());
        Mnap<Obj> mnap=new Mnap<Obj>(new Obj(),Obj.class);
        mnap.f();
        //Mnap<String> mnap =new Mnap<String>(new String("dsd"),);
       // mnap.ff(new Obj());
        Class ca=Obj.class;


       // ca.getConstructors();
       // System.out.println(ca.getConstructors());
    }
}

class Obj{
    Obj(){
        System.out.println("Obj 初始化");
    }
    public void foo(){
    };
}
class Mnap<T>{
    Class<T> cl;
    T obj;
    public Mnap(T obj,Class<T> cl){
        this.obj=obj;
        this.cl=cl;
    }
    public void f(){
        System.out.println(obj.getClass());
        //Class cl=obj.getClass();
        //cl.newInstance();
        try {
            cl.newInstance();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void ff(Object arg){
        boolean bol=cl.isInstance(arg);
        System.out.println(bol);
    }
}
class Building {}
class House extends Building {}

import org.junit.Test;

/**
 * Created by xf on 2017/10/11.
 */
public class SomeJavaCode extends Testtest {

    @Test
    public void test01(){
        InnerTest innerTest=new InnerTest();
        InnerTest.Inner01 inner01 =innerTest.new Inner01();
        inner01.printA();
    }
}
class  InnerTest{
    public class Inner01{
        public void printA(){
            System.out.println("a");
        }

    }
    public static class Inner02{
        public void printStatic(){
            System.out.println("static inner b");
        }
    }
}
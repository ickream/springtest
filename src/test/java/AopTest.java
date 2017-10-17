import com.ickream.service.IUserManagerService;
import com.ickream.service.ServiceTest;
import com.ickream.service.impl.UserManagerServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by xf on 2017/10/12.
 */
public class AopTest extends Testtest {
    @Resource
    public IUserManagerService iUserManagerService;
    @Resource
    public ServiceTest serviceTest;
    @Test
    public void aopTest(){
        //iUserManagerService.setName("xiaoming");
        iUserManagerService.findUser();
        System.out.println("\n");
        iUserManagerService.addUser();
        System.out.println("-------------------------------------------");
        serviceTest.hh();
    }
}

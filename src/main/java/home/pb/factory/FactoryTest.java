package home.pb.factory;

import home.pb.factory.IUserService;
import home.pb.factory.User;
import home.pb.factory.UserServiceFactory;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void factoryTest(){
        /**
         * 简单工厂模式
         */
        UserServiceFactory factory = new UserServiceFactory();
        IUserService service = factory.getIUserService();
        service.addUser(new User());
    }

}

package home.pb.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest(){
        /**
         * 抽象工厂模式
         */
        IServiceFactory factoryA = new ServiceFactoryA();
        IShopService shopServiceA = factoryA.createShopService();
        home.pb.abstractfactory.IUserService userServiceA = factoryA.createUserService();
        userServiceA.testUserMethod();
        shopServiceA.testShopMethod();
        IServiceFactory factoryB = new ServiceFactoryB();
        IShopService shopServiceB = factoryB.createShopService();
        home.pb.abstractfactory.IUserService userServiceB = factoryB.createUserService();
        userServiceB.testUserMethod();
        shopServiceB.testShopMethod();
    }

}

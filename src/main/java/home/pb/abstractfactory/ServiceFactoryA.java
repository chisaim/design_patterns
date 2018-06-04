package home.pb.abstractfactory;

public class ServiceFactoryA implements IServiceFactory {
    @Override
    public IUserService createUserService() {
        return new UserServiceImplA();
    }

    @Override
    public IShopService createShopService() {
        return new ShopServiceImplA();
    }
}

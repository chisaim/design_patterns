package home.pb.abstractfactory;

public class ServiceFactoryB implements IServiceFactory {
    @Override
    public IUserService createUserService() {
        return new UserServiceImplB();
    }

    @Override
    public IShopService createShopService() {
        return new ShopServiceImplB();
    }
}

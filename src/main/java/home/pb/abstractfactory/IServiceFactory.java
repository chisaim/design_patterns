package home.pb.abstractfactory;

public interface IServiceFactory {

    IUserService createUserService();

    IShopService createShopService();

}

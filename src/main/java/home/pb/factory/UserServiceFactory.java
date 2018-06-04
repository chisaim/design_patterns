package home.pb.factory;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UserServiceFactory {

    public IUserService getIUserService(){
        IUserService service = null;
        try {
        InputStream inputStream = UserServiceFactory.class.getResourceAsStream("service.properties");
        Properties properties = new Properties();
        properties.load(inputStream);

        String serviceClassName = properties.getProperty("userService");
        service = (IUserService) (Class.forName(serviceClassName).newInstance());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return service;
    }

}
class aa{

}


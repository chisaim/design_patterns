package home.pb.factory;

public class UserServiceImplA implements IUserService {
    @Override
    public User addUser(User user) {
        System.out.println("UserServiceImplA.addUser().");
        return null;
    }
}

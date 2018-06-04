package home.pb.singleton;

public class DemoFactory {
    private static DemoFactory factory;
    private DemoFactory() {}
    public static DemoFactory getInstance(){
        if (factory == null){
            DemoFactory.factory = new DemoFactory();
        }
        return factory;
    }
}

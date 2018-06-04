package home.pb.singleton;

public class DDMMFactory {

    private static DDMMFactory factory;

    private DDMMFactory() {}

    public static DDMMFactory getInstance(){
        if (factory == null){
            DDMMFactory.factory = new DDMMFactory();
        }
        return factory;
    }
}

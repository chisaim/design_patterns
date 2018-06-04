package home.pb.mediator;

import org.junit.Test;

public class MediatorTest {
    @Test
    public void mediatorTest(){
        MUser robert = new MUser("Robert");
        MUser john = new MUser("John");
        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
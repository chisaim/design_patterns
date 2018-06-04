package home.pb.observer;

import org.junit.Test;

public class ObserverTest {
    @Test
    public void observerTest(){
        Subject subject = new Subject();
        new HexaObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
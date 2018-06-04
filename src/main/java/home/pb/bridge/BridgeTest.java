package home.pb.bridge;

import org.junit.Test;

public class BridgeTest {
    @Test
    public void birdgeTest(){
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greebCircle = new Circle(100,100,10,new GreenCircle());
        redCircle.draw();
        greebCircle.draw();
    }
}

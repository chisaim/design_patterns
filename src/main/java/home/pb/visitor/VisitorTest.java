package home.pb.visitor;

import org.junit.Test;

public class VisitorTest {
    @Test
    public void visitorTest(){
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
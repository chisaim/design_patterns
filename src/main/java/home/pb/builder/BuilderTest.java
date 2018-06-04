package home.pb.builder;

import org.junit.Test;

public class BuilderTest {

    @Test
    public void builderTest(){
        /**
         * Builder模式，创/构建者模式
         */
        IComputerBuilder computerBuilder = new LenovoComputerBuilder();
        Director director = new Director(computerBuilder);
        Computer lenovoComputer = director.contractor();
        computerBuilder = new IBMComputerBuilder();
        director = new Director(computerBuilder);
        Computer IbmComputer = director.contractor();
    }

}

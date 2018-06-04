package home.pb.facade;

import org.junit.Test;

public class facadeTest {
    @Test
    public void facadeTest(){
        SystemFacade facade = new SystemFacade();
        facade.createFinanceReport();
    }
}

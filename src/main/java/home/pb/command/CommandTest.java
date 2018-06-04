package home.pb.command;

import org.junit.Test;

public class CommandTest {
    @Test
    public void commandTest(){
        Stock stock = new Stock();
        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
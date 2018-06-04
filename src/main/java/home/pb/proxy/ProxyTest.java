package home.pb.proxy;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void proxyTest(){
        Image image = new ProxyImage("test_10mb.jpg");
        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
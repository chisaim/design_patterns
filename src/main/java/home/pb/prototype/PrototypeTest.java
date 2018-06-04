package home.pb.prototype;


import org.junit.Test;


public class PrototypeTest {

    /**
     * 浅克隆，主要说明的是将原型中的引用值设置，然后改动克隆后的引用对象值
     * 结果原型中引用对象中的值也被改动了，说明原型对象和克隆对象中的引用对象是同一个
     * 这个可以用对象的hashCode值来体现。
     *
     * 深克隆，原型对象和和克隆对象中引用对象不是同一个
     * 这个引用对象的hashCode值来体现。
     */
    @Test
    public void prototypeTest(){
        PUser PUser = new PUser();
        PUser.setName("SanSan");
        PUser.setAge(23);
        PUser.setGirl(true);
        Address address = new Address();
        address.setCity("杭州");
        address.setStreet("路桥新区");
        PUser.setAddress(address);

//        PUser PUser1 = PUser.clone();
        PUser PUser1 = PUser.IoClone();
        PUser.getAddress().setStreet("台州");
        System.out.println(PUser.getAddress().hashCode());
        System.out.println(PUser1.getAddress().hashCode());
    }

}

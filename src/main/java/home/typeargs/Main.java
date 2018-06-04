package home.typeargs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 简单泛型示例
     */
    @Test
    public  void test1(){
        Gen<Integer> iob = new Gen<>(88);
        iob.showType();
        int v = iob.getOb();
        System.out.println("value: " + v);

        Gen<String> sob = new Gen<>("Generics Test");
        sob.showType();
        String str = sob.getOb();
        System.out.println("value: " + str);
    }

    /**
     * 在泛型类型中声明多个类型参数
     */
    @Test
    public void test2(){
        TwoGen<String,Integer> tg = new TwoGen<>("SanSan",24);
        tg.showType();
        System.out.println(tg.getT());
        System.out.println(tg.getV());
    }

    /**
     * 声明并使用队列<E>通用类型
     */
    @Test
    public void test3() throws QueueEmptyException,QueueFullException{
        Queue<String> queue = new Queue<String>(6);
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
        System.out.println("<===================>");
        queue.insert("A");
        queue.insert("B");
        queue.insert("C");
        queue.insert("D");
        queue.insert("E");
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
        System.out.println("Removing " + queue.remove());
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
        System.out.println("Adding F");
        System.out.println("<===================>");
        queue.insert("F");
        while (!queue.isEmpty()){
            System.out.println("Removing " + queue.remove());
        }
        System.out.println("<===================>");
        System.out.println("Empty: " + queue.isEmpty());
        System.out.println("Full: " + queue.isFull());
    }

    /**
     * 可以创建一个包含在非泛型类中的通用方法
     * 下面的<T,V extends T>这个标记是给括号中的泛型类约束的。
     * 没有的话括号中的泛型会报找不到该泛型类。
     * @param x
     * @param y
     * @param <T>
     * @param <V>
     * @return
     */
    static <T,V extends T> boolean isIn(T x,V[] y){
        for (int i = 0; i < y.length; i++){
            if(x.equals(y[i])){
                return true;
            }
        }
        return false;
    }

    @Test
    public void test4(){
        Integer[] nums = {1,2,3,4,5};
        if (isIn(2,nums)){
            System.out.println("2 is in nums");
        }
        String strs[] = {"one", "two", "three", "four", "five"};
        if(isIn("one",strs)){
            System.out.println("two is in strs");
        }
    }

    static <T> void copyList(List<T> src,List<T> dest){
        for (int i = 0; i < src.size(); i++)
            dest.add(src.get(i));
    }

    @Test
    public void test5(){
        List<String> ls = new ArrayList<>();
        ls.add("A");
        ls.add("B");
        ls.add("C");
        List<String> lsCopy = new ArrayList<>();
        copyList(ls,lsCopy);
        List<Integer> lc = new ArrayList<>();
        lc.add(0);
        lc.add(5);
        List<Integer> lcCopy = new ArrayList<>();
        copyList(lc,lcCopy);
    }

    /**
     * 构造函数可以是通用的，即使它们的类不是
     */
    @Test
    public void test6(){
        MyClass test = new MyClass(100);
        MyClass test2 = new MyClass(123.5F);
        test.showVal();
        test2.showVal();
    }

    /**
     * 泛型接口
     */
    @Test
    public void test7(){
        Integer inums[] = { 3, 6, 2, 8, 6 };
        Character chs[] = { 'b', 'r', 'p', 'w' };
        MyClassMinMax<Integer> a = new MyClassMinMax<>(inums);
        MyClassMinMax<Character> b = new MyClassMinMax<>(chs);
        System.out.println(a.max());
        System.out.println(b.max());
    }

    /**
     * 使用超类泛型
     */
    @Test
    public void test8(){
        MySubClass<String, Integer> x = new MySubClass<>("Value is: ", 99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());

        MySubClassInt<String> w = new MySubClassInt<>("Hello", 4);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }

    @Test
    public void test9(){
        Gen<Integer> iOb = new Gen<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> strOb2 = new Gen2<>("Generics Test");
        System.out.println("iOb2 is instance of Gen2 => "+(iOb2 instanceof Gen2<?>));
        System.out.println("iOb2 is instance of Gen => "+(iOb2 instanceof Gen<?>));
        System.out.println("strOb2 is instance of Gen2 => "+(strOb2 instanceof Gen2<?>));
        System.out.println("strOb2 is instance of Gen => "+(strOb2 instanceof Gen<?>));
        System.out.println("iOb is instance of Gen2 => "+(iOb instanceof Gen2<?>));
        System.out.println("iOb is instance of Gen => "+(iOb instanceof Gen<?>));

        System.out.println("<=====泛型类中的方法可以像任何其他方法一样重写======>");
        System.out.println(iOb.showType());
        System.out.println(iOb2.showType());

        System.out.println("<=====你可以将一个泛型类的一个实例转换成另一个只有两个是兼容的，它们的类型参数是相同的。======>");
        iOb = (Gen<Integer>) iOb2;//因为iOb2是Gen< Integer>的实例。
        //iOb = (Gen<Long>) iOb2;//wrong。但是，这个演员是不合法的，因为iOb2不是Gen<Long>的实例。类型参数是不相同的
    }

    /**
     * 1.泛型中的类型参数不能实例化
     * Gen() {
        ob = new T(); // Illegal!!!
        }
     * 2.类型参数不能使用static关键字修饰，包括属性变量，方法。
     static T ob;
     static T getob() {
     return ob;
     }
     static void showob() {
     System.out.println(ob);
     }
     * 3.不能实例化基本类型是类型参数的数组。您不能创建类型特定的泛型引用的数组
     * class MyClass<T extends Number> {
            T ob;
            T vals[];

        MyClass(T o, T[] nums) {
            ob = o;
            vals = nums;
        }
     }
     * Gen<Integer> gens[] = new Gen<Integer>[10];// Can"t create an array of type-specific generic references.
     * MyClass<?> gens[] = new MyClass<?>[10]; // OK
     */

}

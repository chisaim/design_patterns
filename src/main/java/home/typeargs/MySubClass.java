package home.typeargs;

public class MySubClass<T,V> extends MyClassSuper<T> {

    V ob2;

    public MySubClass(T o,V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2(){
        return ob2;
    }
}

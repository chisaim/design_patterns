package home.typeargs;

public class MySubClassInt<T> extends MyClassInt {

    T ob;

    public MySubClassInt(T o,int num) {
        super(num);
        ob = o;
    }

    public T getOb() {
        return ob;
    }
}


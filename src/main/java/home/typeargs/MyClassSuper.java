package home.typeargs;

public class MyClassSuper<T> {

    T ob;

    public MyClassSuper(T o) {
        ob = o;
    }

    T getOb(){
        return ob;
    }


}

package home.typeargs;

public class TwoGen<T,V> {

    private T t;

    private V v;

    public TwoGen(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public void showType(){
        System.out.println("Type of T is " + t.getClass().getName());
        System.out.println("Type of V is " + v.getClass().getName());
    }

    T getT(){
        return t;
    }

    V getV(){
        return v;
    }


}

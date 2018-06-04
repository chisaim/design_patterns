package home.typeargs;

public class Gen<T> {

    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public String showType(){
        return this.getClass().getName();
    }

}


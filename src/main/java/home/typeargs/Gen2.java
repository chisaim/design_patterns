package home.typeargs;

public class Gen2<T> extends Gen<T> {

    public Gen2(T ob) {
        super(ob);
    }

    @Override
    public String showType() {
        return this.getClass().getName();
    }
}

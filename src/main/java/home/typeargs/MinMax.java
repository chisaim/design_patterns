package home.typeargs;

public interface MinMax<T extends Comparable<T>> {
    T max();
}

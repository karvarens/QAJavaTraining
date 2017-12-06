package auditorium.braceChecker;

public interface Stack<T> {

    void push(T v);
    T pop();

    boolean isEmpty();
    void clear();
}

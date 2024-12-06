package Lesson9.Task3;

public interface OwnList<E> {
    int DEFAULT_CAPACITY = 10;
    boolean add(E e);
    E get(int index);
    boolean remove(E o);
    int size();
}

package Lesson8;
public interface OwnList {
    int size();
    boolean isEmpty();
    void add(Integer element);
    Integer get(int i);
    void add(int index, Integer element) throws ArrayIndexOutOfBoundsException;
    Integer remove(int index);
}

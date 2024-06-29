package Lesson8.Task2;
import Lesson8.OwnList;
import java.util.List;
public class PeterList implements OwnList {
    private final List<Integer> Mylist;
    public PeterList(List<Integer> MyList) {
        this.Mylist = MyList;
    }
    @Override
    public int size() {
        return Mylist.size();
    }
    @Override
    public boolean isEmpty() {
        return Mylist.isEmpty();
    }
    @Override
    public void add(Integer element) {
        Mylist.add(element);
    }
    @Override
    public Integer get(int i) {
        return Mylist.get(i);
    }
    @Override
    public void add(int index, Integer element) throws ArrayIndexOutOfBoundsException {
        boolean isListIndexInScope = index <= Mylist.size();
            if (isListIndexInScope) {
                Mylist.add(index, element);
            } else {
                throw new ArrayIndexOutOfBoundsException("Wrong List index!");
            }
    }
    @Override
    public Integer remove(int index) throws ArrayIndexOutOfBoundsException {
        boolean isListIndexInScope = index <= Mylist.size();
            if (isListIndexInScope) {
                return Mylist.remove(index);
            } else {
                throw new ArrayIndexOutOfBoundsException("Wrong List index!");
            }
    }
    @Override
    public String toString() {
        return "PeterList " + Mylist;
    }
}


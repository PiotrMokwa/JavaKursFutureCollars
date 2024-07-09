package Lesson9.Task1;
import java.util.LinkedList;
import java.util.List;
public class Bucket {
    List<StoragedObject> list;
    public Bucket(StoragedObject element){
        this.list = new LinkedList<>();
        this.list.add(element);
    }
}

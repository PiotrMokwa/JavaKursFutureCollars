package Lesson9.Task1;
import java.util.Objects;
public class StoragedObject {
    String key;
    String value;
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    public StoragedObject(String key, String value){
        this.key = key;
        this.value = value;
    }
}

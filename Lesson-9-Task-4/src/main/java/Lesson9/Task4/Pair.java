package Lesson9.Task4;
public class Pair<E> {
    private E valueK;
    private E valueV;
    public Pair(E value1, E value2){
        this.valueK = value1;
        this.valueV = value2;
    }
    public E getValueK() {
        return valueK;
    }
    public E getValueV() {
        return valueV;
    }
}

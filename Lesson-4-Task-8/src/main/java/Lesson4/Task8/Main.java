package Lesson4.Task8;
public class Main {
    public static void main(String[] args){
        Person john = new Person("John","Kowalski", 40,1.87f);
        Person joe = new Person("Joe","Kowalski", 40,1.87f);
        Person mark = john;
        john.testEqualsAndHashCode(mark);
        john.testEqualsAndHashCode(joe);
    }
}

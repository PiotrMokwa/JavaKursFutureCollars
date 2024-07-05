package Lesson8.Task4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Person> friendsList = getPersonList();
        Comparator<Person> comparatorHeight = new Comparator<Person>() {
            public int compare(Person f1, Person f2) {
                return Double.compare(f1.getHeight(), f2.getHeight());
            }
        };
        Comparator<Person> comparatorWeight = new Comparator<Person>() {
            public int compare(Person f1, Person f2) {
                return Double.compare(f2.getWeight(), f1.getWeight());
            }
        };
        Comparator<Person> comparatorYears = new Comparator<Person>() {
            public int compare(Person f1, Person f2) {
                return Double.compare(f1.getYears(), f2.getYears());
            }
        };
        friendsList.sort(comparatorHeight);
            for (Person person : friendsList) {
                System.out.println("My name is " + person.getFirstName() + ". I' am " + person.getHeight() + " m tall.");
            }
        System.out.println();
        friendsList.sort(comparatorWeight);
            for (Person person : friendsList) {
                System.out.println("My name is " + person.getFirstName() + ". My weight is " + person.getWeight());
            }
        System.out.println();
        friendsList.sort(comparatorYears);
            for (Person person : friendsList) {
                System.out.println("My name is " + person.getFirstName() + ". I'am " + person.getYears() + " years old.");
            }
    }
    private static List<Person> getPersonList() {
        Person Peter = new Person("Peter", "Kowalski", 1990, 185.3, 60);
        Person James = new Person("James", "Smith", 2000, 170, 70);
        Person Mary = new Person("Mary", "Johnson", 1980, 190, 67);
        Person Linda = new Person("Linda", "Lopez", 2020, 130, 20);
        Person Barbara = new Person("Barbara", "Jones", 1970, 160, 78);
        List<Person> friendsList = new ArrayList<>();
        friendsList.add(Peter);
        friendsList.add(James);
        friendsList.add(Mary);
        friendsList.add(Linda);
        friendsList.add(Barbara);
        return friendsList;
    }
}

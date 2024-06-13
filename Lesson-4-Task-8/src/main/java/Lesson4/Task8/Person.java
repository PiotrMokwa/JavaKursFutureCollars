package Lesson4.Task8;
import java.util.Objects;
public class Person {
    private String name;
    private String lastName;
    private int age;
    private float hight;
     public Person(String name, String lastName, int age, float hight){
         this.name = name;
         this.lastName = lastName;
         this.age = age;
         this.hight = hight;
     }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Float.compare(hight, person.hight) == 0 && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, hight);
    }
}

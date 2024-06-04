package Lesson4.Task8;
public class Person {
    private String name;
    private String lastName;
    private int age;
    private float hight;
    private int counter = 0;
     public Person(String name, String lastName, int age, float hight){
        this.name = name;
     }
     public void testEqualsAndHashCode( Person o2) {
         counter++;
         System.out.println("Test " + counter);
         System.out.println(this.name + " code: "
                 + this.hashCode());
         System.out.println(o2.name + " code: "
                 + o2.hashCode());
         System.out.println(this.name
                 + " and "
                 + o2.name
                 + " is the same: "
                 + this.equals(o2));
     }
}

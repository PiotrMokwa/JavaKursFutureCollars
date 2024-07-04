package Lesson8.Task4;
public class Person {
    String firstName;
    String secondName;
    int birthYear;
    double height;
    double weight;
    public Person(String firstName, String secondName, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }
    public int getYears() {
        int currentYear = 2024;
        return currentYear - this.birthYear;
    }
}

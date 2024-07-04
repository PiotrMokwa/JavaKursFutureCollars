package Lesson8.Task4;
public class Person {
    private final String firstName;
    private final String secondName;
    private final int birthYear;
    private final double height;
    private double weight;
    public Person(String firstName, String secondName, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }
    public String getFirstName() {
        return firstName;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public String getSecondName() {
        return secondName;
    }

    public int getYears() {
        int currentYear = 2024;
        return currentYear - this.birthYear;
    }
}

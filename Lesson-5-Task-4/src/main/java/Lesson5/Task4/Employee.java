package Lesson5.Task4;
import java.math.BigDecimal;
public class Employee {
    public static final String WHITE_SPACE = " ";
    private final String name;
    private final String surname;
    private BigDecimal baseSalary;
    private BigDecimal bonus;
        private int age;
            public Employee(String name, int age, BigDecimal baseSalary, BigDecimal bonus, String surname) {
                this.name = name;
                this.age = age;
                this.baseSalary = baseSalary;
                this.bonus = bonus;
                this.surname = surname;
            }
            public Employee(String n, String sN) {
                this.name = n;
                this.surname = sN;
            }
            public Employee(String n, String sN, int age) {
                this.name = n;
                this.age = age;
                this.surname = sN;
            }
            public Employee(String n, String sN, int age, BigDecimal value) {
                this.name = n;
                this.age = age;
                this.surname = sN;
                this.baseSalary = value;
            }
            public String getEmployeeName() {
                return "Employee name : " + name + " " + surname;
            }
            public String getEmployeeAge() {
                return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
            }
            public BigDecimal getBaseSalaryWithBonus() {
                return baseSalary.add(bonus);
            }
            public BigDecimal getBaseSalary() {
                return baseSalary;
            }
            public BigDecimal getBonus() {
                return bonus;
            }
}
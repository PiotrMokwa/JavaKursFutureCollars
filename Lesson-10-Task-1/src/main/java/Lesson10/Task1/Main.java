package Lesson10.Task1;

import static Lesson10.Task1.Main.findPerson;

public class Main {
    public static void main(String[] args) {
        Main.findPerson("Harry Wilson");
        Main.findPerson("Harry Wi");
    }
    public static void findPerson(String fullName){
        PhoneBook phoneBook = new PhoneBook(10);
        Person personData = new Person();
        String personFullName = fullName;
            try {
                personData = phoneBook.getPersonData(personFullName);

            } catch (Exception exception) {
                System.out.println(exception.getClass().getSimpleName());
            }
        System.out.println(personFullName + " :");
        System.out.println("            Adress: " + personData.address);
        System.out.println("            Telephone number: " + personData.phoneNumber);
        phoneBook.display();
    }
}

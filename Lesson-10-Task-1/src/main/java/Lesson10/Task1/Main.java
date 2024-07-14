package Lesson10.Task1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(10);
        Person personData = new Person();
        String personFullName = "Harry Wilson";
        try {
            personData = phoneBook.getPersonData(personFullName);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(personFullName + " :");
        System.out.println("            Adress: " + personData.address);
        System.out.println("            Telephone number: " + personData.phoneNumber);
        phoneBook.display();
    }
}

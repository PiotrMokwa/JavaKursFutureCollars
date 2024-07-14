package Lesson10.Task1;
public class Main {
    public static void main(String[] args) {
        Main.findPerson("Harry Wilson");
        Main.findPerson("Harry Wi");
    }
    public static void findPerson(String fullName){
        PhoneBook phoneBook = new PhoneBook(10);
        Person personData = new Person();
            try {
                personData = phoneBook.getPersonData(fullName);

            } catch (Exception exception) {
                System.out.println(exception.getClass().getSimpleName());
            }
        System.out.println(fullName + " :");
        System.out.println("            Adress: " + personData.address);
        System.out.println("            Telephone number: " + personData.phoneNumber);
        phoneBook.display();
    }
}

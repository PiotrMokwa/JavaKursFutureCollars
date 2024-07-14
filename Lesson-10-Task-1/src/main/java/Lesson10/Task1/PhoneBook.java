package Lesson10.Task1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class PhoneBook implements OwnPhoneBook {
    private final HashMap<String, Person> phoneList;
        public PhoneBook(int initialCapacity) {
            this.phoneList = new HashMap<>(initialCapacity);
            assignDataToList(getDataFromFile());
        }
        @Override
        public Person getPersonData(String fullName) throws Exception{
            if (this.phoneList.get(fullName) != null) {
                return this.phoneList.get(fullName);
            } else {
                throw new Exception(fullName + " Wasn't found!!!");
            }
        }
        @Override
        public String getDataFromFile() {
            String data = "";
                try {
                    data = Files.readString(Path.of("PhoneBookData.txt"));

                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            return data;
        }
        public void display(){
            System.out.println("========================Phone Book==================================");
                for (Map.Entry<String, Person> person : this.phoneList.entrySet()) {
                    String address = person.getValue().address;
                    int phoneNumber = person.getValue().phoneNumber;
                    System.out.println(person.getKey() + " :");
                    System.out.println("                " + address);
                    System.out.println("                " + phoneNumber);
                }
        }
        public void assignDataToList(String text){
            String[] dataArray = text.split("\r\n");
                for (String s : dataArray) {
                    String[] singlePersonData = s.split(";");
                    Person person = new Person();
                    String personName = singlePersonData[0];
                    person.address = singlePersonData[1];
                    person.phoneNumber = Integer.parseInt(singlePersonData[2]);
                    this.phoneList.put(personName, person);
                }
        }
}

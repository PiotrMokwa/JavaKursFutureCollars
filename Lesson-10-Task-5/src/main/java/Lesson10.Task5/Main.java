package Lesson10.Task5;
public class Main {
    public static void main(String[] args){
        String password = "werAa1e";
        PasswordValidator passwordValidator = new PasswordValidator(password);
        System.out.println(passwordValidator.check());
    }
}

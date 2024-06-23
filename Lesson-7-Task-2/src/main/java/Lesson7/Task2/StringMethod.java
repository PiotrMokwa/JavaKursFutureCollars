package Lesson7.Task2;

public class StringMethod {
    public StringMethod() {
    }

    public String toUpper(String text) {
        String newString;
        try {
            newString = text.toUpperCase();
        } catch (NullPointerException e) {

            return "Nothing was passed to transform";
        }
        return newString;
    }
}

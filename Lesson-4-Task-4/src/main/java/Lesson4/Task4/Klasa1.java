package Lesson4.Task4;
import Lesson4.TextFormatter;

public class Klasa1 implements TextFormatter {
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}

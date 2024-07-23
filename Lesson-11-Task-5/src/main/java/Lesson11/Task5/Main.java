package Lesson11.Task5;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> wordList = List.of(
                "Peter"
                , "John"
                , "Daisy"
                , "Sophia");
        getUniqueLetters(wordList);
    }
    public static void getUniqueLetters(List<String> list){
        Set<String> setOfCharacter = list.stream()
                .map(String::toUpperCase)
                .map(value ->value.chars())
                .flatMapToInt(value->value)
                .mapToObj(value -> Character.toString(value))
                .collect(Collectors.toSet());
        System.out.println(setOfCharacter);
    }
}

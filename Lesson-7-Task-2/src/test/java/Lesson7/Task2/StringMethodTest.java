package Lesson7.Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StringMethodTest {
    @ParameterizedTest(name = "Transform text '{0}' to upperCase")
    @ValueSource(strings = {"java", "Java"})
    @DisplayName("Transform text to upperCase")
    public void shouldToUpperCaseEquals(String textInput) {
        //given
        StringMethod text = new StringMethod();
        //when
        String result = text.toUpper(textInput);
        //then
        Assertions.assertEquals("JAVA", result);
    }
    @ParameterizedTest(name = "Transform text with empty source to upperCase")
    @DisplayName("Transform text to upperCase with empty source")
    @EmptySource
    public void shouldToUpperCaseEmpty(String textInput) {
        //given
        StringMethod text = new StringMethod();
        //when
        String result = text.toUpper(textInput);
        //then
        Assertions.assertEquals("", result);
    }
    @ParameterizedTest(name = "Transform text to upperCase with null")
    @DisplayName("Transform text to upperCase with null source")
    @NullSource
    public void shouldToUpperCaseNull(String textInput) {
        //given
        StringMethod text = new StringMethod();
        //when
        String result = text.toUpper(textInput);
        //then
        Assertions.assertEquals("Nothing was passed to transform", result);
    }

}

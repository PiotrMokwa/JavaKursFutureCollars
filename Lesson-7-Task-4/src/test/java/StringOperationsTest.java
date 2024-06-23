import Lesson7.Task4.StringOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
public class StringOperationsTest {
    @ParameterizedTest(name = "How long is string {0} ? ")
    @MethodSource("provideDataSourceForGetTextLengthEquals")
    @DisplayName("How long is string ?")
    public void shouldGetTextLengthEquals(String text, int textLength) {
        //given
        StringOperations stringOperations = new StringOperations();
        //when
        int result = stringOperations.getTextLength(text);
        //then
        Assertions.assertEquals(textLength, result);
    }
    private static Stream<Arguments> provideDataSourceForGetTextLengthEquals() {
        return Stream.of(
                Arguments.arguments("Peter", 5),
                Arguments.arguments("Jon", 3),
                Arguments.arguments("", 0)
        );
    }
}

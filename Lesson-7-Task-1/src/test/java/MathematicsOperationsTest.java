import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class MathematicsOperationsTest {
    @ParameterizedTest(name = "Should veryfy wether number {0} is divide by 2 - True")
    @DisplayName("Should veryfy wether number is divide by 2 - True")
    @ValueSource(doubles = {2, -2, 10, -10})
    public void shouldIsDivideBy2True(double number) {
        //given
        MathematicsOperations operation = new MathematicsOperations();
        //when
        boolean result = operation.isDividedBy2(number);
        //then
        Assertions.assertTrue(result);
    }

    @ParameterizedTest(name = "Should veryfy wether number {0} is divide by 2 - False")
    @DisplayName("Should veryfy wether number is divide by 2 - False?")
    @ValueSource(doubles = {1, -1, 5, -5})
    public void shouldIsDivideBy2False(double number) {
        //given
        MathematicsOperations operation = new MathematicsOperations();
        //when
        boolean result = operation.isDividedBy2(number);
        //then
        Assertions.assertFalse(result);
    }

    @ParameterizedTest(name = "Is Digit sum of number {0} equal {1} ")
    @DisplayName("Is Digit sum of number correct?")
    @CsvSource(value = {"123:6", "-66:0", "+66:12"}, delimiter = ':')
    public void shouldDigitSumOfNumber(String number, int sum) {
        //given
        MathematicsOperations operatoins = new MathematicsOperations();
        //when
        int result = operatoins.DigitSumOfNumber(number);
        //then
        Assertions.assertEquals(sum, result);
    }
}

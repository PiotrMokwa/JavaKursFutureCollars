package Lesson7.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
public class TrainingScoreTest {
    private static Stream<Arguments> provideDataForGetTimeLengthRating() {
        return Stream.of(
                Arguments.of("20", 300, 100, 1),
                Arguments.of("30", 300, 100, 2),
                Arguments.of("50", 300, 100, 2),
                Arguments.of("60", 300, 100, 2),
                Arguments.of("70", 300, 100, 3)
        );
    }
    @DisplayName("Is training length rate ok")
    @ParameterizedTest(name = "Is training {0} minutes length get rate {3}")
    @MethodSource("provideDataForGetTimeLengthRating")
    public void shouldGetTimeLengthRating(int time, int caloriesNumber, int heartRate, int timeRateExpected) {
        //given
        TrainingScore training = new TrainingScore(time, caloriesNumber, heartRate);
        //when
        int result = training.getTimeLengthRating();
        //then
        Assertions.assertEquals(timeRateExpected, result);
    }
    private static Stream<Arguments> provideDataForGetCaloriesBurnedRating() {
        return Stream.of(
                Arguments.of("20", 100, 100, 1),
                Arguments.of("20", 300, 100, 1),
                Arguments.of("20", 350, 100, 2),
                Arguments.of("20", 400, 100, 3),
                Arguments.of("20", 450, 100, 3)

        );
    }
    @DisplayName("Is training burned calories rate ok")
    @ParameterizedTest(name = "Is training {1} calories burned get rate {3}")
    @MethodSource("provideDataForGetCaloriesBurnedRating")
    public void shouldGetCaloriesBurnedRating(int time, int caloriesNumber, int heartRate, int caloriesRateExpected) {
        //given
        TrainingScore training = new TrainingScore(time, caloriesNumber, heartRate);
        //when
        int result = training.getCaloriesBurnedRating();
        //then
        Assertions.assertEquals(caloriesRateExpected, result);
    }
    private static Stream<Arguments> provideDataForGetAverageHeartRateRating() {
        return Stream.of(
                Arguments.of("20", 100, 100, 3),
                Arguments.of("20", 100, 160, 2),
                Arguments.of("20", 100, 165, 2),
                Arguments.of("20", 100, 175, 2),
                Arguments.of("20", 100, 180, 1)

        );
    }
    @DisplayName("Is training heart rate ok")
    @ParameterizedTest(name = "Is training {2} bpm get rate {3}")
    @MethodSource("provideDataForGetAverageHeartRateRating")
    public void shouldGetAverageHeartRateRating(int time, int caloriesNumber, int heartRate, int heartRateExpected) {
        //given
        TrainingScore training = new TrainingScore(time, caloriesNumber, heartRate);
        //when
        int result = training.getAverageHeartRateRating();
        //then
        Assertions.assertEquals(heartRateExpected, result);
    }
}

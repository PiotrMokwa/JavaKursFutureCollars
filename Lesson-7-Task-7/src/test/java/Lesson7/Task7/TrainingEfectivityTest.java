package Lesson7.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import java.util.stream.Stream;
public class TrainingEfectivityTest {
    private static Stream<Arguments> provideDataForGetTotalScore() {
        return Stream.of(
                Arguments.of(1, 1, 1, 1),
                Arguments.of(2, 1, 1, 1.17),
                Arguments.of(2, 2, 1, 1.5),
                Arguments.of(2, 3, 1, 1.83)
        );
    }
    @DisplayName("Is training total score rate ok")
    @ParameterizedTest(name = "Is trainings scores {0},{1},{2}, give total score {3} ")
    @MethodSource("provideDataForGetTotalScore")
    public void shouldGetTotalScore(int timeScore, int caloriesScore, int heartRateScore, double totalScore) {
        //given
        TrainingScore mockedTrainingScore = Mockito.mock(TrainingScore.class);
        TrainingEfectivity efectivity = new TrainingEfectivity(mockedTrainingScore);
        Mockito.when(mockedTrainingScore.getTimeLengthRating()).thenReturn(timeScore);
        Mockito.when(mockedTrainingScore.getCaloriesBurnedRating()).thenReturn(caloriesScore);
        Mockito.when(mockedTrainingScore.getAverageHeartRateRating()).thenReturn(heartRateScore);
        //when
        double result = efectivity.getTotalScore();
        //then
        Assertions.assertEquals(totalScore, result);
    }
    private static Stream<Arguments> provideDataForGetEffectivity() {
        return Stream.of(
                Arguments.of(1, 1, 1, "Low training effectivity"),
                Arguments.of(2, 2, 1, "Good training effectivity"),
                Arguments.of(3, 3, 2, "Very good training effectivity"),
                Arguments.of(3, 3, 3, "Excellent training effectivity")
        );
    }
    @DisplayName("Is effectivity opinion ok")
    @ParameterizedTest(name = "Is effectivity opinion of scores {0},{1},{2}, give message: {3} ")
    @MethodSource("provideDataForGetEffectivity")
    public void shouldGetEffectivity(int timeScore, int caloriesScore, int heartRateScore, String messageOpinon) {
        //given
        TrainingScore mockedTrainingScore = Mockito.mock(TrainingScore.class);
        TrainingEfectivity effectivity = new TrainingEfectivity(mockedTrainingScore);
        Mockito.when(mockedTrainingScore.getTimeLengthRating()).thenReturn(timeScore);
        Mockito.when(mockedTrainingScore.getCaloriesBurnedRating()).thenReturn(caloriesScore);
        Mockito.when(mockedTrainingScore.getAverageHeartRateRating()).thenReturn(heartRateScore);
        //when
        String result = effectivity.getEffectivity();
        //then
        Assertions.assertEquals(messageOpinon, result);
    }
}

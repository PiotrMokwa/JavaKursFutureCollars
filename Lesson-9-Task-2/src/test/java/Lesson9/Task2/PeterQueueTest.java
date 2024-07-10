package Lesson9.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.Objects;
public class PeterQueueTest {
@ParameterizedTest(name="Is add correct? with queue values {0} and added {1}  as last element: ")
@DisplayName("Is add correct ")
@CsvSource(value = {"10:20"},delimiter = ':')
    public void shouldAdd(String firstValue, String secondValue){
        //when
        PeterQueue queue = new PeterQueue(Integer.valueOf(firstValue));
        //then
        boolean result = queue.add(Integer.valueOf(secondValue));
        //given
        Assertions.assertTrue(result);
    }
    @ParameterizedTest(name="Is remove correct? with queue values {0} and {1} .Removed first element {0}: ")
    @DisplayName("Is remove correct ")
    @CsvSource(value = {"10:20"},delimiter = ':')
    public void shouldRemove(String firstValue, String secondValue){
        //when
        PeterQueue queue = new PeterQueue(Integer.valueOf(firstValue));
        queue.add(Integer.valueOf(secondValue));
        //then
        Integer result = queue.remove();
        //given
        boolean isFirstElementReturned = Integer.valueOf(firstValue).equals(result);
        boolean isFirstElementNew= !Objects.equals(Integer.valueOf(secondValue), Integer.valueOf(firstValue));
        boolean totalResult = isFirstElementReturned & isFirstElementNew;
        Assertions.assertTrue(totalResult);
    }
    @ParameterizedTest(name="Is element taken? with queue values {0} and {1}. Get first element {0}  : ")
    @DisplayName("Is element taken correct ")
    @CsvSource(value = {"10:20"},delimiter = ':')
    public void shouldElement(String firstValue, String secondValue){
        //when
        PeterQueue queue = new PeterQueue(Integer.valueOf(firstValue));
        queue.add(Integer.valueOf(secondValue));
        //then
        Integer result = queue.element();
        //given
        Assertions.assertEquals(Integer.valueOf(firstValue),result);
    }
}


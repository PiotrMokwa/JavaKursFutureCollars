package Lesson9.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Objects;
import java.util.stream.Stream;
public class PeterHashMapTest {
    private static Stream<Arguments> provideDataForShouldGetHashTestTrue() {
        return Stream.of(
                Arguments.of("30", "Peter")
        );
    }
    @ParameterizedTest(name = "Is put method correct")
    @MethodSource("provideDataForShouldGetHashTestTrue")
    public void shoulPutTestTrue(String key, String value) {
        //given
        PeterHashMap peterHashMap = new PeterHashMap(key, value);
        //when
        boolean result1 = peterHashMap.put(key, value);
        boolean result2 = peterHashMap.containsKey(key);
        boolean result3 = peterHashMap.containsValue(value);
        boolean totalResult = result1 & result2 & result3;
        //then
        Assertions.assertTrue(totalResult);
    }
    private static Stream<Arguments> provideDataForShouldContainsKey() {
        return Stream.of(
                Arguments.of("Peter", "30")
        );
    }
    @ParameterizedTest(name = "Is ContainsKey method correct")
    @MethodSource("provideDataForShouldContainsKey")
    public void shoulContainsKey(String key, String value) {
        //given
        PeterHashMap peterHashMap = new PeterHashMap(key, value);
        //when
        boolean result = peterHashMap.containsKey(key);
        //then
        Assertions.assertTrue(result);
    }
    private static Stream<Arguments> provideDataForShouldContainsValue() {
        return Stream.of(
                Arguments.of("Peter", "30")
        );
    }
    @ParameterizedTest(name = "Is ContainsValue method correct")
    @MethodSource("provideDataForShouldContainsValue")
    public void shouldContainsValue(String key, String value) {
        //given
        PeterHashMap peterHashMap = new PeterHashMap(key, value);
        //when
        boolean result = peterHashMap.containsValue(value);
        //then
        Assertions.assertTrue(result);
    }
    private static Stream<Arguments> provideDataForShouldRemove() {
    return Stream.of(
            Arguments.of("Peter", "30")
    );
    }
@ParameterizedTest(name = "Is shouldRemove method correct")
@MethodSource("provideDataForShouldRemove")
    public void shouldRemove(String key, String value) {
    //given
    PeterHashMap peterHashMap = new PeterHashMap(key, value);

    //when
    String removedValue = peterHashMap.remove(key);
    boolean result2 = peterHashMap.containsKey(key);
    boolean result = Objects.equals(removedValue, value) & !result2;
    //then

    Assertions.assertTrue(result);
    }
    private static Stream<Arguments> provideDataForShouldGet() {
        return Stream.of(
                Arguments.of("Peter", "30","John","50")
        );
    }

    @ParameterizedTest(name = "Is shouldGet method correct")
    @MethodSource("provideDataForShouldGet")
    public void shouldGet(String key1, String value1, String key2, String value2) {
        //given
        PeterHashMap peterHashMap = new PeterHashMap(key1, value1);
        peterHashMap.put(key2,value2);
        //when
        String result = peterHashMap.get(key2);
        //then
        Assertions.assertEquals(value2,result);
    }
}
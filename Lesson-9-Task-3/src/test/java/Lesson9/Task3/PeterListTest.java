package Lesson9.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
public class PeterListTest {
    public static Stream<Arguments> provideDataForShouldAdd(){
        return Stream.of(
                Arguments.of(1,2,3)
        );
    }
    @ParameterizedTest(name = "Is element added type Integer?")
    @DisplayName("Is element added type Integer?")
    @MethodSource("provideDataForShouldAdd")
        public void shouldAdd( Integer firstValue, Integer secondValue, Integer thirdValue){
        //given
        PeterList<Integer> peterList = new PeterList<>(Integer.class);
        //when
        peterList.add(firstValue);
        peterList.add(secondValue);
       boolean isDeleted = peterList.add(thirdValue);
       boolean isContain = peterList.contains(thirdValue);
       boolean result = isContain & isDeleted;
        //then
        Assertions.assertTrue(result);
    }
    public static Stream<Arguments> provideDataForShouldAddString(){
        return Stream.of(
                Arguments.of("1","2","3")
        );
    }
    @ParameterizedTest(name = "Is element added type String?")
    @DisplayName("Is element added type String?")
    @MethodSource("provideDataForShouldAddString")
    public void shouldAddString( String firstValue, String secondValue, String thirdValue){
        //given
        PeterList<String> peterList = new PeterList<>(String.class);
        //when
        peterList.add(firstValue);
        peterList.add(secondValue);
        boolean isDeleted = peterList.add(thirdValue);
        boolean isContain = peterList.contains(thirdValue);
        boolean result = isContain & isDeleted;
        //then
        Assertions.assertTrue(result);
    }
    public static Stream<Arguments> provideDataForShouldGet(){
        return Stream.of(
                Arguments.of("1","2","3", 2)
        );
    }
    @ParameterizedTest(name = "Is element get ?")
    @DisplayName("Is element get")
    @MethodSource("provideDataForShouldGet")
    public void shouldGet( String firstValue, String secondValue, String thirdValue, int index){
        //given
        PeterList<String> peterList = new PeterList<>(String.class);
        peterList.add(firstValue);
        peterList.add(secondValue);
        peterList.add(thirdValue);
        //when
        String result = peterList.get(index);
        //then
        Assertions.assertArrayEquals(thirdValue.toCharArray(), result.toCharArray());
    }
    public static Stream<Arguments> provideDataForShouldRemove(){
        return Stream.of(
                Arguments.of("1","2","3", "2")
        );
    }
    @ParameterizedTest(name = "Is element {1} removed ?")
    @DisplayName("Is element removed")
    @MethodSource("provideDataForShouldRemove")
    public void shouldRemove( String firstValue, String secondValue, String thirdValue, String element){
        //given
        PeterList<String> peterList = new PeterList<>(String.class);
        peterList.add(firstValue);
        peterList.add(secondValue);
        peterList.add(thirdValue);
        //when
        boolean result = peterList.remove(element);
        boolean contains = peterList.contains(secondValue);
        boolean totalResult = result & !contains;
        //then
        Assertions.assertTrue(totalResult);
    }
    public static Stream<Arguments> provideDataForShouldSize(){
        return Stream.of(
                Arguments.of("1","2","3", 13)
        );
    }
    @ParameterizedTest(name = "Is list size {3} ?")
    @DisplayName("Is list size {3} ?")
    @MethodSource("provideDataForShouldSize")
    public void shouldSize( String firstValue, String secondValue, String thirdValue, int size){
        //given
        PeterList<String> peterList = new PeterList<>(String.class);
        peterList.add(firstValue);
        peterList.add(secondValue);
        peterList.add(thirdValue);
        //when
        int result = peterList.size();
        //then
        Assertions.assertEquals(size,result);
    }
}

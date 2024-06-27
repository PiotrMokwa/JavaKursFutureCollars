import Lesson7.BaseSalary;
import Lesson7.SaturdaySalary;
import Lesson7.Task8.SalaryCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import java.math.BigDecimal;
import java.util.stream.Stream;
import static org.mockito.ArgumentMatchers.anyDouble;
public class SalaryCalculatorTest {
    private static Stream<Arguments> provideDataForShouldGetTotalEmployeeSalary(){
        return Stream.of(
                Arguments.of(0,0,0,0,0,0),
                Arguments.of(2000,500,100,4,400,2900)
        );
    }
    @ParameterizedTest(name="Is calculate salary ok for {0}+{1}+{2}*{3} ={5} ?")
    @DisplayName("Is calculate salary ok?")
    @MethodSource("provideDataForShouldGetTotalEmployeeSalary")
    public void shouldGetTotalEmployeeSalary( double baseSalary, double bonusSalary,double bonusForOneDay,
                                             double numberOfSaturdays, double totalSaturdaySaalry,  double totalSalary){
        //given
        BaseSalary mockedBaseSalary = Mockito.mock(BaseSalary.class);
        SaturdaySalary mockedSaturdaySalary = Mockito.mock(SaturdaySalary.class);
        SalaryCalculator salary = new SalaryCalculator(bonusSalary, mockedBaseSalary,mockedSaturdaySalary);
        Mockito.when(mockedBaseSalary.getBaseSalary()).thenReturn(BigDecimal.valueOf(baseSalary));
        Mockito.when(mockedSaturdaySalary.getSaturdaySalary(anyDouble() ,anyDouble())).thenReturn(BigDecimal.valueOf(totalSaturdaySaalry));
        //when
        BigDecimal result = salary.getTotalEmployeeSalary(bonusForOneDay,numberOfSaturdays);
        //then
        Assertions.assertEquals(BigDecimal.valueOf(totalSalary),result);
    }
}

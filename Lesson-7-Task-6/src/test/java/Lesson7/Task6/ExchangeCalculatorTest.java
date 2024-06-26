package Lesson7.Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class ExchangeCalculatorTest {
    private static Stream<Arguments>provideDataForGetSaleValueInCurrency(){
        return Stream.of(
                Arguments.of("10","2.487",Currency.$,"4.0212" ),
                Arguments.of("10","2.289",Currency.€,"4.3679" ),
                Arguments.of("10","1.959",Currency.£,"5.1046" )
        );
    }
    @ParameterizedTest(name = "Exchange {0} zł on {1} {2} with sale exchange rate {3}")
    @DisplayName("Exchange złoty with saleExchangeRate")
    @MethodSource("provideDataForGetSaleValueInCurrency")
    public void shouldGetSaleValueInCurrencyDollars(String zlotyCurrencyValue, String CurrencyValue, Currency currency, String currencyExchangeRate) {
        //given
        ExchangeCalculator calculate = new ExchangeCalculator();
        BigDecimal zlotyCurrency = new BigDecimal(zlotyCurrencyValue);
        BigDecimal dollarCurrency = new BigDecimal(CurrencyValue);
        BigDecimal currencyExchange = new BigDecimal(currencyExchangeRate);
        ExchangeRate mockedExchangeRate = Mockito.mock(ExchangeRate.class);
        Mockito.when(mockedExchangeRate.getSaleRate(currency)).thenReturn(currencyExchange);
        //when
        BigDecimal result = calculate.getSaleCurrencyValue(zlotyCurrency, currency);
        //then
        Assertions.assertEquals(dollarCurrency, result);
    }
    private static Stream<Arguments>provideDataForGetPurchaseValueInCurrencyDollars(){
        return Stream.of(
                Arguments.of("10","2.516",Currency.$,"3.9739" ),
                Arguments.of("10","2.334",Currency.€,"4.2838" ),
                Arguments.of("10","1.963",Currency.£,"5.0949" )
        );
    }
    @ParameterizedTest(name = "Exchange {0} zł on {1} {2} with purchase exchange rate {3}")
    @MethodSource("provideDataForGetPurchaseValueInCurrencyDollars")
    @DisplayName("Exchange złoty with purchaseExchangeRate")
    public void shouldGetPurchaseValueInCurrencyDollars(String zlotyCurrencyValue, String CurrencyValue, Currency currency, String currencyExchangeRate) {
        //given
        ExchangeCalculator calculate = new ExchangeCalculator();
        BigDecimal zlotyCurrency = new BigDecimal(zlotyCurrencyValue);
        BigDecimal dollarCurrency = new BigDecimal(CurrencyValue);
        BigDecimal currencyExchange = new BigDecimal(currencyExchangeRate);
        ExchangeRate mockedExchangeRate = Mockito.mock(ExchangeRate.class);
        Mockito.when(mockedExchangeRate.getPurchaseRate(currency)).thenReturn(currencyExchange);
        //when
        BigDecimal result = calculate.getPurchaseCurrencyValue(zlotyCurrency, currency);
        //then
        Assertions.assertEquals(dollarCurrency, result);
    }
}



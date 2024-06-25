package Lesson7.Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import java.math.BigDecimal;

public class ExchangeCalculatorTest {
    @ParameterizedTest(name = "Exchange {0} złoty on {1} dollars ")
    @CsvSource(value = {"10:2.487", "40:9.947"}, delimiter = ':')
    @DisplayName("Exchange złoty on dollars with saleExchangeRate")
    public void shouldGetSaleValueInCurrencyDollars(String zlotyCurrencyValue, String dollarCurrencyValue) {
        //given
        ExchangeCalculator calculate = new ExchangeCalculator();
        BigDecimal zlotyCurrency = new BigDecimal(zlotyCurrencyValue);
        BigDecimal dollarCurrency = new BigDecimal(dollarCurrencyValue);
        ExchangeRate mockedExchangeRate = Mockito.mock(ExchangeRate.class);
        Mockito.when(mockedExchangeRate.getSaleRate(Currency.$)).thenReturn(BigDecimal.valueOf(4.0212));

        //when
        BigDecimal result = calculate.getSaleCurrencyValue(zlotyCurrency, Currency.$);
        //then
        Assertions.assertEquals(dollarCurrency, result);
    }

    @ParameterizedTest(name = "Exchange {0} złoty on {1} euro ")
    @CsvSource(value = {"10:2.289", "40:9.158"}, delimiter = ':')
    @DisplayName("Exchange złoty on euro with saleExchangeRate")
    public void shouldGetSaleValueInCurrencyEuro(String zlotyCurrencyValue, String euroCurrencyValue) {
        //given
        ExchangeCalculator calculate = new ExchangeCalculator();
        BigDecimal zlotyCurrency = new BigDecimal(zlotyCurrencyValue);
        BigDecimal dollarCurrency = new BigDecimal(euroCurrencyValue);
        ExchangeRate mockedExchangeRate = Mockito.mock(ExchangeRate.class);
        Mockito.when(mockedExchangeRate.getSaleRate(Currency.€)).thenReturn(BigDecimal.valueOf(4.3679));

        //when
        BigDecimal result = calculate.getSaleCurrencyValue(zlotyCurrency, Currency.€);
        //then
        Assertions.assertEquals(dollarCurrency, result);
    }

    @ParameterizedTest(name = "Exchange {0} złoty on {1} dollars")
    @CsvSource(value = {"10:2.516", "40:10.066"}, delimiter = ':')
    @DisplayName("Exchange złoty on dollars with purchaseExchangeRate")
    public void shouldGetPurchaseValueInCurrencyDollars(String zlotyCurrencyValue, String dollarCurrencyValue) {
        //given
        ExchangeCalculator calculate = new ExchangeCalculator();
        BigDecimal zlotyCurrency = new BigDecimal(zlotyCurrencyValue);
        BigDecimal dollarCurrency = new BigDecimal(dollarCurrencyValue);
        ExchangeRate mockedExchangeRate = Mockito.mock(ExchangeRate.class);
        Mockito.when(mockedExchangeRate.getPurchaseRate(Currency.$)).thenReturn(BigDecimal.valueOf(3.9739));

        //when
        BigDecimal result = calculate.getPurchaseCurrencyValue(zlotyCurrency, Currency.$);
        //then
        Assertions.assertEquals(dollarCurrency, result);
    }

    @ParameterizedTest(name = "Exchange {0} złoty on {1} euro ")
    @CsvSource(value = {"10:2.334", "40:9.338"}, delimiter = ':')
    @DisplayName("Exchange złoty on euro with purchaseExchangeRate")
    public void shouldGetPurchaseValueInCurrencyEuro(String zlotyCurrencyValue, String dollarCurrencyValue) {
        //given
        ExchangeCalculator calculate = new ExchangeCalculator();
        BigDecimal zlotyCurrency = new BigDecimal(zlotyCurrencyValue);
        BigDecimal dollarCurrency = new BigDecimal(dollarCurrencyValue);
        ExchangeRate mockedExchangeRate = Mockito.mock(ExchangeRate.class);
        Mockito.when(mockedExchangeRate.getPurchaseRate(Currency.€)).thenReturn(BigDecimal.valueOf(4.2838));

        //when
        BigDecimal result = calculate.getPurchaseCurrencyValue(zlotyCurrency, Currency.€);
        //then
        Assertions.assertEquals(dollarCurrency, result);
    }
}



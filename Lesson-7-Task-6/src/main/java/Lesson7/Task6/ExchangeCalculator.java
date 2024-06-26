package Lesson7.Task6;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeCalculator implements ExchangeRate {

    public BigDecimal getSaleCurrencyValue(BigDecimal zlotyCurrency, Currency currency) {
        return zlotyCurrency.divide(ExchangeRate.super.getSaleRate(currency), 3, RoundingMode.HALF_UP);
    }

    public BigDecimal getPurchaseCurrencyValue(BigDecimal zlotyCurrency, Currency currency) {
        return zlotyCurrency.divide(ExchangeRate.super.getPurchaseRate(currency), 3, RoundingMode.HALF_UP);
    }
}

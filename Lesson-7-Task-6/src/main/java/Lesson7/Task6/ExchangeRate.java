package Lesson7.Task6;
import java.math.BigDecimal;

public interface ExchangeRate {
    default BigDecimal getSaleRate(Currency currency) {
        BigDecimal dollarSale = new BigDecimal("4.0212");
        BigDecimal euroSale = new BigDecimal("4.3679");
        BigDecimal poundSale = new BigDecimal("5.1046");
        BigDecimal OutOyCurrencyScope = new BigDecimal("0");
        switch (currency) {
            case $:
                return dollarSale;
            case €:
                return euroSale;
            case £:
                return poundSale;
        }
        return OutOyCurrencyScope;
    }
    default BigDecimal getPurchaseRate(Currency currency) {
        BigDecimal dollarPurchase = new BigDecimal("3.9739");
        BigDecimal euroSalePurchase = new BigDecimal("4.2838");
        BigDecimal poundSalePurchase = new BigDecimal("5.0949");
        BigDecimal OutOyCurrencyScope = new BigDecimal("0");
        switch (currency) {
            case $:
                return dollarPurchase;
            case €:
                return euroSalePurchase;
            case £:
                return poundSalePurchase;
        }
        return OutOyCurrencyScope;
    }
}

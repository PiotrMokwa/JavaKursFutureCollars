package Lesson7.Task6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        ExchangeCalculator calculate = new ExchangeCalculator();
        BigDecimal zlotyCurrency = new BigDecimal("10");
        System.out.println(Sale(Currency.$) + calculate.getSaleCurrencyValue(zlotyCurrency,Currency.$));
        System.out.println(Purchase(Currency.$) + calculate.getPurchaseCurrencyValue(zlotyCurrency,Currency.$));
    }
    public static String Sale(Currency currency){
        return "Sale for " + currency;
    }
    public static String Purchase(Currency currency){
        return "Purchase for " + currency;
    }
}

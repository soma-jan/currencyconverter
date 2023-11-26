package com.example.CurrencyCoverter.model;

import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor

@Getter
@Setter
@Data
public class ExchangeRate {

    static String shortName;
    static HashMap<String,Double> exchangeValues =new HashMap<>();

    public ExchangeRate( String shortName) {

        this.shortName=shortName;

    }

    public HashMap<String, Double> getExchangeValues() {
        return exchangeValues;
    }

    public void setExchangeValues(HashMap<String, Double> exchangeValues) {
        this.exchangeValues = exchangeValues;
    }

    public static  void defaultValues(String fromCurrency) {
        String currency = fromCurrency;

        switch(currency) {
            case "USD":
                exchangeValues.put("USD", 1.00);
                exchangeValues.put("EUR", 0.93);
                exchangeValues.put("GBP", 0.66);
                exchangeValues.put("CHF", 1.01);
                break;
            case "EUR":
                exchangeValues.put("USD", 1.073);
                exchangeValues.put("EUR", 1.00);
                exchangeValues.put("GBP", 0.71);
                exchangeValues.put("CHF", 1.08);
                break;
            case "GBP":
                exchangeValues.put("USD", 1.51);
                exchangeValues.put("EUR", 1.41);
                exchangeValues.put("GBP", 1.00);
                exchangeValues.put("CHF", 1.52);
                break;
            case "CHF":
                exchangeValues.put("USD", 0.99);
                exchangeValues.put("EUR", 0.93);
                exchangeValues.put("GBP", 0.66);
                exchangeValues.put("CHF", 1.00);
                break;


        }
    }
    public static Map<String,Double> init(String fromCurrency)
    {
         defaultValues(fromCurrency);
        return exchangeValues;
    }
}

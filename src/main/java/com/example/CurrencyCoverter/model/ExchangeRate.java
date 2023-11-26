package com.example.CurrencyCoverter.model;

import lombok.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ExchangeRate {

    private String shortName;
    private HashMap<String,Double> exchangeValues =new HashMap<>();

    public ExchangeRate( String shortName) {

        this.shortName=shortName;

    }

    public HashMap<String, Double> getExchangeValues() {
        return exchangeValues;
    }

    public void setExchangeValues(HashMap<String, Double> exchangeValues) {
        this.exchangeValues = exchangeValues;
    }

    public   void defaultValues(String fromCurrency) {
        String currency = fromCurrency;

        switch(currency) {
            case "USD":
                this.exchangeValues.put("USD", 1.00);
                this.exchangeValues.put("EUR", 0.93);
                this.exchangeValues.put("GBP", 0.66);
                this.exchangeValues.put("CHF", 1.01);
                break;
            case "EUR":
                this.exchangeValues.put("USD", 1.073);
                this.exchangeValues.put("EUR", 1.00);
                this.exchangeValues.put("GBP", 0.71);
                this.exchangeValues.put("CHF", 1.08);
                break;
            case "GBP":
                this.exchangeValues.put("USD", 1.51);
                this.exchangeValues.put("EUR", 1.41);
                this.exchangeValues.put("GBP", 1.00);
                this.exchangeValues.put("CHF", 1.52);
                break;
            case "CHF":
                this.exchangeValues.put("USD", 0.99);
                this.exchangeValues.put("EUR", 0.93);
                this.exchangeValues.put("GBP", 0.66);
                this.exchangeValues.put("CHF", 1.00);
                break;


        }
    }
    public  Map<String,Double> init(String fromCurrency)
    {
         this.defaultValues(fromCurrency);
        return exchangeValues;
    }
}

package com.example.CurrencyCoverter.service;

import com.example.CurrencyCoverter.dto.ExchangeRateDto;
import com.example.CurrencyCoverter.model.ExchangeRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


@Service
public class CurrencyExchangeService {
    @Autowired
    private ExchangeRate exchangerate;
    public ExchangeRateDto getExchnageRate(String fromCur, String toCur, Double fromAmount)
    {

        Double toAmount =null;
        Map<String,Double> exchangeValueMap =exchangerate.init(fromCur);
        toAmount =Math.round(fromAmount * exchangeValueMap.get(toCur))*100d/100d;
        return new ExchangeRateDto(fromCur,toCur,fromAmount,toAmount);

    }
}

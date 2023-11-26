package com.example.CurrencyCoverter.controller;

import com.example.CurrencyCoverter.dto.ExchangeRateDto;
import com.example.CurrencyCoverter.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private CurrencyExchangeService currencyexchangeservice;

    @GetMapping("{from}/{to}")
    public ResponseEntity<?> getExchangeRate(@PathVariable String from,
                                                           @PathVariable String to,
                                                           @RequestBody Double amt)
    {
        ExchangeRateDto exchangeratedto=currencyexchangeservice.getExchnageRate(from,to,amt);
       return new ResponseEntity<>(exchangeratedto, HttpStatus.OK);
    }
}

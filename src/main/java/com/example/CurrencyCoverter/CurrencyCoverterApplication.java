package com.example.CurrencyCoverter;

import com.example.CurrencyCoverter.configuaration.IntialiseExchngeRate;
import com.example.CurrencyCoverter.model.ExchangeRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CurrencyCoverterApplication {
	static List<ExchangeRate> exchangeratelist =new ArrayList<>();

	public static void main(String[] args) {

		SpringApplication.run(CurrencyCoverterApplication.class, args);



	}
	@Bean
	public ExchangeRate getExchangeRate() {
		return new ExchangeRate();
	}



}

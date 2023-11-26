package com.example.CurrencyCoverter.dto;

import lombok.*;

@Data@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExchangeRateDto {
    String from;
    String to;
    Double fromAmount;
    Double toAmount;
}

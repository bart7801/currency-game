package com.bart.currencygame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import com.bart.currencygame.model.CurrencyModel;

@Controller
public class CurrencyClient {

    public CurrencyModel getCurrencyRates() {
        RestTemplate restTemplate = new RestTemplate();
        CurrencyModel forObject = restTemplate.getForObject(
                "https://api.exchangeratesapi.io/latest?base=PLN",
                CurrencyModel.class);
        return forObject;
    }
}

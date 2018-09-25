package com.example.product.clients;

import com.example.product.models.quote.Quote;
import org.springframework.web.client.RestTemplate;


public class QuoteClient {

    public Quote getRandomQuote() {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        return quote;
    }
}

package com.example.product.controllers;

import com.example.product.clients.QuoteClient;
import com.example.product.models.quote.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class QuoteController {

    private QuoteClient quoteClient;

    public QuoteController() {
        quoteClient = new QuoteClient();
    }

    @GetMapping("/quote")
    public Quote getRandomQuote() {
        return quoteClient.getRandomQuote();
    }
}

package com.lesiak.chucknorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class JokeImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

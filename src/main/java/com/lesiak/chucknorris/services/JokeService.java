package com.lesiak.chucknorris.services;

import org.springframework.stereotype.Service;

@Service
public interface JokeService {
    String getJoke();
}

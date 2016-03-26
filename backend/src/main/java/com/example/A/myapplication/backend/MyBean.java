package com.example.A.myapplication.backend;

import com.example.FunnyJoke;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private FunnyJoke jokes;

    public MyBean() {
        jokes= new FunnyJoke();
    }

    public String getJoke() {
        return jokes.getFunnyJoke();
    }
}
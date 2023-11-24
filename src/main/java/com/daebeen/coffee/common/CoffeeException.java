package com.daebeen.coffee.common;

public class CoffeeException extends RuntimeException{

    private final CoffeeError error;

    public CoffeeException(CoffeeError error){
        this.error = error;
    }

}
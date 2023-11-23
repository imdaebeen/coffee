package main.java.com.daebeen.coffee.common;

public class CoffeeException extends java.lang.RuntimeException{

    private final CoffeeError error;

    public CoffeeException(CoffeeError error){
        this.error = error;
    }

}
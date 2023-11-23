package main.java.com.daebeen.coffee.common;

public class CoffeeBadRequestException extends CoffeeException {
    public CoffeeBadRequestException(CoffeeError error) {
        super(error);
    }
}
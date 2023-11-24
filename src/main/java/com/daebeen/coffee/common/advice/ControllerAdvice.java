package com.daebeen.coffee.common.advice;

public class ControllerAdvice {


    public String error(Exception e){
        return "";
    }

    public String coffeeError(Exception e){
        return "";
    }

    public String coffeeBadRequestError(){
        return "";
    }

}
package com.company.java_core.homework9;

public class MyException extends Exception{
    private double num1;
    private double num2;

    private boolean MyException(double num1, double num2){
        if(num1 > 0 && num2 > 0){
            return false;
        }
        return false;
    }
}

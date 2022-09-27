package com.company.java_core.homework9;

public class Methods {
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public Methods(double num1, double num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(double num1, double num2) throws IllegalArgumentException {
        double rez = num1 + num2;
        return rez;
    }

    public double sub(double num1, double num2){
        double rez = num1 - num2;
        return rez;
    }

    public double mul(double num1, double num2){
        double rez = num1 * num2;
        return rez;
    }

    public double div(double num1, double num2){
        double rez = num1 / num2;
        return rez;
    }
}

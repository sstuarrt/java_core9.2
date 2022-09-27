package com.company.java_core.homework9;
import java.util.Scanner;

public class Main extends MyException{
    public static void main(String[] args) {
        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one: ");
        num1 = sc.nextInt();
        System.out.println("Enter number two: ");
        num2 = sc.nextInt();
        Methods rez = new Methods(num1, num2);

        if(num1 < 0 && num2 < 0){
            String s="first";
            try {
                throw new IllegalArgumentException(s);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        if((num1 == 0) && (num2 !=0) || (num1 != 0) && (num2 == 0)) {
            throw new ArithmeticException();
        }
        if(num1 == 0 && num2 == 0){
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        if(num1 > 0 && num2 > 0){
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}

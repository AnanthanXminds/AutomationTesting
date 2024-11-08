package com.test;

import java.util.List;
import java.util.Scanner;

public class Calculator {
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator that you need to do the operation" +
                " : '+', '-', '/', '*'");
        String operator = sc.next();
        System.out.println("Enter your first number");
        Integer firstNumber = sc.nextInt();
        System.out.println("Enter your second number");
        Integer secondNumber = sc.nextInt();
        int output;
        switch (operator){
            case "+" -> {
                output = firstNumber+secondNumber;
                System.out.println("Answer : " + output);
            }
            case "-" -> {
                output = firstNumber-secondNumber;
                System.out.println("Answer : " + output);
            }
            case "/" -> {
                output = firstNumber/secondNumber;
                System.out.println("Answer : " + output);
            }
            case "*" -> {
                output = firstNumber*secondNumber;
                System.out.println("Answer : " + output);
            }
            default -> System.out.println("Give a valid expression");
        }
    }
}

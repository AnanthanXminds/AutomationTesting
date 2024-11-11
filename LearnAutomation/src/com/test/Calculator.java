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
        int output = switch (operator){
            case "+" -> {
                yield firstNumber+secondNumber;
            }
            case "-" -> {
                yield firstNumber-secondNumber;
            }
            case "/" -> {
                yield firstNumber/secondNumber;
            }
            case "*" -> {
                yield  firstNumber*secondNumber;
            }
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        System.out.println("Answer : " + output);
    }
}

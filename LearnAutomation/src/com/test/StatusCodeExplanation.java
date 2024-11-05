package com.test;

import java.util.Scanner;

public class StatusCodeExplanation {
    public void giveStatusExplanation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the status code");
        int code = sc.nextInt();
        switch (code){
            case 200-> System.out.println("200 : OK");
            case 400-> System.out.println("400 : Bad Request");
            case 403-> System.out.println("403 : Forbidden");
            case 500 -> System.out.println("500 : Internal Server Error");
            default -> System.out.println("You have entered a invalid status code");
        }
        System.out.println("Do you want to continue checking the status code explanation. " +
                "Type Yes or No");
        String choice = sc.next();
        switch (choice){
            case "yes","Yes","YES" -> giveStatusExplanation();
        }
        sc.close();
    }
}

package com.test;

import java.util.Scanner;

public class DuplicateWord {
    String yourSentence;
    String [] stringArray;
    public void findDuplicate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string sequence");
        yourSentence = sc.next();
        System.out.println(yourSentence);
        String [] word = yourSentence.split(" ");
        for (int i=0;i<word.length;i++){
            for (int j=i+1;j< word.length;j++){
                if (word[i].equalsIgnoreCase(word[j])){
                    System.out.println(word[i]+" is repeating");
                }
            }
        }


    }
}

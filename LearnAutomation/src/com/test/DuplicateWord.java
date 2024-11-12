package com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateWord {
    String yourSentence;
    String [] stringArray;
    public void findDuplicate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string sequence");
        yourSentence = sc.nextLine();
        List<String> duplicateWords = new ArrayList<>();
        String [] word = yourSentence.split(" ");
        for (int i=0;i<word.length;i++){
            for (int j=i+1;j< word.length;j++){
                if (word[i].equalsIgnoreCase(word[j]) && !duplicateWords.contains(word[i])){
                    duplicateWords.add(word[i]);
                }
            }
        }
        System.out.println("Repeating word are : ");
        duplicateWords.forEach(System.out::println);


    }
    public static void main(String args []){
        DuplicateWord duplicateWord = new DuplicateWord();
        duplicateWord.findDuplicate();
    }
}

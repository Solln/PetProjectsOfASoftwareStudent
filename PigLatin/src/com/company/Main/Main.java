package com.company.Main;

import java.util.Scanner;

public class Main {

    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your String");
        System.out.println(createPigLatinWord(sc1.nextLine()));

    }

    public static String extractFirstLetter(String iWord){
        return iWord.substring(0,1);
    }

    public static String addAy(String iLetter) {
        return iLetter + "ay";
    }

    public static String removeFirstLetter(String iWord){
        return iWord.substring(1);
    }

    public static String createPigLatinWord(String iWord){
        return removeFirstLetter(iWord) + "-" + addAy(extractFirstLetter(iWord));
    }
}

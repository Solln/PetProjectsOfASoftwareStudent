package com.company.Main;

import java.util.Scanner;

public class Main {

    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your String");
        System.out.println("Vowels: " + (getString().length() - getString().replaceAll("a|e|i|o|u", "").length()));
    }

    public static String getString(){
        return sc1.nextLine();
    }

}


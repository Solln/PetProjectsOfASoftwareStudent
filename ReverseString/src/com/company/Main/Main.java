package com.company.Main;

import java.util.Scanner;

public class Main {

    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your String");
        System.out.println(reverseString(getString()));
    }


    public static String getString(){
        return sc1.nextLine();
    }


    public static String reverseString(String input){

        StringBuilder output = new StringBuilder();

        int i = input.length();

        while (i > 0){
            output.append(input.charAt(i - 1));
            i--;
        }

        return output.toString();
    }

}

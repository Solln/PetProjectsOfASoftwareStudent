package com.company.Main;

import java.util.Scanner;

public class Main {

    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your String");
        System.out.println(isPalindrome(getString().toCharArray()));
    }

    public static String getString(){
        return sc1.nextLine();
    }

    public static boolean isPalindrome(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }



}

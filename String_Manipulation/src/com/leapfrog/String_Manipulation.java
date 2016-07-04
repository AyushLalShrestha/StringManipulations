package com.leapfrog;

import java.util.Scanner;

public class String_Manipulation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your String ( It can include Blankspaces) :  ");
        String word1;
        word1 = sc.nextLine();

        count(word1);

    }

    public static void count(String word) {
        int vowels = 0, consonants = 0;
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                str = str + word.charAt(i);
            }

        }

        for (int i = 0; i < str.length(); i++) {

            char ch = (str.toLowerCase()).charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'e' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }

        }

        System.out.println("The Total number of Vowels = " + vowels + " and Total number of consonants = " + consonants);

    }

}

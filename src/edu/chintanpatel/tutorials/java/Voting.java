package edu.chintanpatel.tutorials.java;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = input.nextInt();

        if (age < 18) {
            System.out.println("You are not eligible for voting");
        }
        else {
            System.out.println("You are eligible for voting");
        }
    }
}

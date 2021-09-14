package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 16 - Legal Driving Age");
        System.out.print("What is your age? ");
        int agee;
        Scanner in = new Scanner(System.in);
        agee = in.nextInt();
        if(agee<16) {
            System.out.println("You are not old enough to legally derive.");
        }
        else
        {
            System.out.println("You are old enough to legally drive.");
        }

    }
}

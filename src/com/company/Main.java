package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\tWelcome to Wonderland !\n\n");

        System.out.println("\tEnter your name : ");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.nextLine();
        System.out.println("\tHello, "+playerName+" !");

        int beginAnswer;

        do{
            System.out.println("\tShall we begin ?");
            System.out.println("\t\t1. YES\n\t\t2. NO");
            beginAnswer = sc.nextInt();
        }
        while(beginAnswer != 1);


        Random random = new Random();
        int number =random.nextInt(20) + 1;

        System.out.println("\tPlease guess a number : ");
        int playerInput = sc.nextInt();


        int attempts = 0;
        boolean hasWon = false;
        boolean shouldEnd = false;

        while(!shouldEnd)
        {
            attempts++;

            if(attempts < 5)
            {
                if(playerInput == number)
                {
                    hasWon = true;
                    shouldEnd = true;
                }
                else if(playerInput > number)
                {
                    System.out.println("Guess a lower number !");
                    playerInput = sc.nextInt();
                }
                else
                {
                    System.out.println("Guess a higher number !");
                    playerInput = sc.nextInt();
                }
            }
            else
            {
                shouldEnd = true;
            }
        }

        if(hasWon == true)
        {
            System.out.println("\tCongratulations !\n\tYou have guessed correctly in "+attempts+" attempts");
        }
        else
        {
            System.out.println("Game Over !");
            System.out.println("The number was "+number);
        }

    }
}

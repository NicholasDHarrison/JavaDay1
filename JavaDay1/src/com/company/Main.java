package com.company;

import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            //Use the variables below to compose the following paragraph:
            //name, adjective, verbOne, verbTwo, number, yourName
            // Dear name,
            // You are adverb adjective and I want to be your noun!
            // I want to go to the nounTwo with you in number days.
            //Sincerely, yourName
            // Make a scanner
            //
            //

//          ---------------------------------------------------------------------------------------------------------
            //TIME TO BREAK THINGS!!!!
            Scanner input = new Scanner(System.in);
//            first thing to break is through a syntax error, making System into system!
//            system.out.println("What is the name?");
//            you MUST INITIAL CAPS ALL CLASSES

            String Name = input.nextLine();
            System.out.println("Enter an adjective:");
            String adjective = input.nextLine();
            System.out.println("Enter a noun");
            String nounOne = input.nextLine();
            System.out.println("Enter another noun");
            String nounTwo = input.nextLine();
            System.out.println("Enter your name?");
            String yourName = input.nextLine();
            System.out.println("Enter a number");
//            nextString ain't a thing!
//            int number = input.nextString();
//            Due to LINE 23 having Name, when it is called it MUST be the exact same (capitalization matters!)
//            System.out.printf("Dear %s\n", name);
//            System.out.printf("You are %s and I want to be your %s! I want to go to the %s with you in %d days.\n",
//                    adjective, nounOne, nounTwo, number);
            System.out.printf("Sincerely,\n%s\n", yourName);
        }
    }


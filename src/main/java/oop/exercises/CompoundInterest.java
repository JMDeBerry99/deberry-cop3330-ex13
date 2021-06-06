/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class CompoundInterest
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is the principal amount? ");
        String input = in.nextLine();
        double principal = Double.parseDouble(input);
        System.out.print("What is the rate? ");
        input = in.nextLine();
        double interestRate = Double.parseDouble(input);
        System.out.print("What is the number of years? ");
        input = in.nextLine();
        int years = Integer.parseInt(input);
        System.out.print("What is the number of times the interest is compounded per year? ");
        input = in.nextLine();
        int compound = Integer.parseInt(input);

        //processing
        double investment = principal * Math.pow(1 + interestRate/compound/100, compound * years);
        if ((investment * 1000) % 10 > 5)
        {
            investment += 0.01; //rounds to next penny
        }

        //output
        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f.", principal,
                                                                            interestRate, years, compound, investment);
    }
}

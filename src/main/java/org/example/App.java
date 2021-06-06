package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
At some point, you might have to deal with currency exchange rates,
and you’ll need to ensure your calculations are as precise as possible.

Write a program that converts currency. Specifically, convert euros to U.S. dollars.
Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro.
Print out the new amount in U.S. dollars.

The formula for currency conversion is

amount_to = (amount_from * rate_from) / rate_to

where

amount_to is the amount in U.S. dollars.
amount_from is the amount in euros.
rate_from is the current exchange rate in euros.
rate_to is the current exchange rate of the U.S. dollar.

Example

How many euros are you exchanging? 81
What is the exchange rate? 137.51
81 euros at an exchange rate of 137.51 is
111.38 U.S. dollars.

Constraints
Ensure that fractions of a cent are rounded up to the next penny.
Use a single output statement.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        String numEuro = in.next();

        System.out.println("What is the exchange rate?");
        String exRate = in.next();

        var bigEuro = new BigDecimal(numEuro);
        var bigRate = new BigDecimal(exRate);
        var bigDollar = new BigDecimal("0");

        bigDollar = (bigEuro.multiply(bigRate).divide(new BigDecimal("100")));

        System.out.println(bigEuro + " euros at an exchange rate of " + bigRate + " is " + bigDollar.setScale(2, RoundingMode.HALF_UP).toString() + " U.S. dollars.");
    }
}

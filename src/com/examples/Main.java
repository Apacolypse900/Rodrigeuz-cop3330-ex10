package com.examples;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        double taxrate = 0.055;

        int price1;
        int quantity1;
        System.out.print("Enter the Price of Item 1: ");
            price1 = myObj.nextInt();
        System.out.print("Enter the quantity of item 1: ");
            quantity1 = myObj.nextInt();

        int price2;
        int quantity2;
        System.out.print("Enter the prices of item 2: ");
            price2  = myObj.nextInt();
        System.out.print("Enter the quantity of item 2: ");
            quantity2 = myObj.nextInt();

        int price3;
        int quantity3;
        System.out.print("Enter the price of item 3: ");
            price3 = myObj.nextInt();
        System.out.print("Enter the quantity of item 3: ");
            quantity3 = myObj.nextInt();

        double Subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = Subtotal * taxrate;
        double total = Subtotal + tax;

        System.out.println("Subtotal: $" + Subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}

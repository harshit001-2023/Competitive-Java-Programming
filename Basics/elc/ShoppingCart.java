package Basics.elc;

import Basics.blc.Discount;

import java.util.Locale;
import java.util.Scanner;

public class ShoppingCart {
    void main(){
        // Taking input from user
        Scanner sc = new Scanner(System.in);
        IO.println("Enter you name: ");
        String name = sc.next();
        IO.println("Enter your bill Amount : ");
        double amount = sc.nextDouble();

        // Calling and Printing methods from Discount BLC class
        IO.println("Customer name: "+name.toUpperCase(Locale.ROOT));
        IO.println("Original Bill: "+amount);
        IO.println("Amount Payable after Discount "+ Discount.calculateDiscount(amount));
    }
}

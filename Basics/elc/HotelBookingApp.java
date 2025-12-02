package Basics.elc;

import Basics.blc.Hotel;

import java.util.Scanner;

public class HotelBookingApp {
    static void main() {

        // Taking user details like Name, Hotel Name, Room Rate per Day, Days Stayed, etc.
        Scanner sc = new Scanner(System.in);
        IO.print("Enter Customer Name: ");
        String name = sc.nextLine();

        IO.print("Enter Hotel Name: ");
        String hotelName = sc.nextLine(); // Changed to nextLine()

        IO.print("Enter Room Rate per Day: ");
        double roomRate = sc.nextDouble();

        IO.print("Enter Number of Days Stayed: ");
        int days = sc.nextInt();

        // Showing user information for confirmation.
        IO.println("Customer Name: " + name);
        IO.println("Hotel Name: " + hotelName);
        IO.println("Room Rate per Day: " + roomRate);
        IO.println("Days Stayed: " + days);

        // Printing all user details and their and their total payable bill with discount
        IO.println("Customer Name : "+name);
        IO.println("Hotel Name : "+hotelName);
        IO.println("Customer Name : "+roomRate);
        IO.println("Day Stayed : "+days);
        double totalAmount = Hotel.calculateTotalAmount(roomRate, days);
        IO.println("Total Amount : "+ totalAmount);
        IO.println("Customer Name : "+Hotel.calculateDiscountedAmount(days, totalAmount));
    }
}

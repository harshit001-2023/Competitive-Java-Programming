package Basics.elc;

import Basics.blc.Hotel;

import java.util.Scanner;

public class HotelBookingApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Enter Customer Name: ");
        String name = sc.nextLine();

        IO.print("Enter Hotel Name: ");
        String hotelName = sc.nextLine(); // Changed to nextLine()

        IO.print("Enter Room Rate per Day: ");
        double roomRate = sc.nextDouble();

        IO.print("Enter Number of Days Stayed: ");
        int days = sc.nextInt();

        IO.println("Customer Name: " + name);
        IO.println("Hotel Name: " + hotelName);
        IO.println("Room Rate per Day: " + roomRate);
        IO.println("Days Stayed: " + days);

        IO.println("Customer Name : "+name);
        IO.println("Hotel Name : "+hotelName);
        IO.println("Customer Name : "+roomRate);
        IO.println("Day Stayed : "+days);
        double totalAmount = Hotel.calculateTotalAmount(roomRate, days);
        IO.println("Total Amount : "+ totalAmount);
        IO.println("Customer Name : "+Hotel.calculateDiscountedAmount(days, totalAmount ));
    }
}

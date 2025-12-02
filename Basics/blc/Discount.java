package Basics.blc;

public class Discount {

    // Creating static method for discount calculation which returns double format
    public static double calculateDiscount(double amount){
        // If Amount is more than 5k then give 20% of discount
        if(amount >= 5000) return amount-(amount * 0.20);
            // If Amount is in between 5k and 3k then give 15% of discount
        else if (amount < 5000 && amount >= 3000) return amount - (amount * 0.15);
            // If Amount is in between 3k and 1k then give 10% of discount
        else if (amount < 3000 && amount >= 1000) return amount - (amount * 0.10);
            // If Amount is less than 1k then give 5% of discount
        else return amount - (amount*0.05);
        }
}

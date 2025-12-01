package Basics.blc;

public class Discount {
    public static double calculateDiscount(double amount){
        if(amount >= 5000) return amount-(amount * 0.20);
        else if (amount < 5000 && amount >= 3000) return amount - (amount * 0.15);
        else if (amount < 3000 && amount >= 1000) return amount - (amount * 0.10);
        else return amount - (amount*0.05);
        }
}

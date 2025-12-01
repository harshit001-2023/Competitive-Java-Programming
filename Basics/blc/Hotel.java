package Basics.blc;

public class Hotel {
    public static double calculateTotalAmount(double roomRate, int days){
        return roomRate * days;
    }
    public static double calculateDiscountedAmount(int days, double totalAmount){
        if(days == 1 || days == 2) return totalAmount-(totalAmount * 0.0); //Days 1-2 no discount
        if(days == 3 || days == 4) return totalAmount-(totalAmount * 0.05); //Days 1-2 no discount
        if(days >= 5 && days <= 9) return totalAmount-(totalAmount * 0.10); //Days 1-2 no discount
        else return totalAmount-(totalAmount*0.20);
    }
}

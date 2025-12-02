package Basics.blc;

public class Hotel {
    // Method to Calculate Total Amount
    public static double calculateTotalAmount(double roomRate, int days){
        //Takes two inputs Rate of room and days stayed
        // Return their calculation
        return roomRate * days;
    }

    // Giving discount on Amount
    public static double calculateDiscountedAmount(int days, double totalAmount){
        // If a user spent 1-2 days hen give them no discount
        if(days == 1 || days == 2) return totalAmount-(totalAmount * 0.0);
        // If a user spent 3-4 days hen give them 5% discount
        if(days == 3 || days == 4) return totalAmount-(totalAmount * 0.05);
        // If a user spent 5-9 days hen give them 10% discount
        if(days >= 5 && days <= 9) return totalAmount-(totalAmount * 0.10);
        // If a user spent more than 10 days hen give them 20% discount
        else return totalAmount-(totalAmount*0.20);
    }
}

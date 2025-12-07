package Basics;

import java.lang.Math;

public class ArmstrongNum {
    public static void main(String[] x) {
        int a = Integer.parseInt(x[0]);
        int org = a;  
        int c = 0;
        int temp = a;  
        
        while(temp != 0) {
            c++;
            temp /= 10;
        }
        
        double arm = 0;
        temp = org; 
        
        
        while(temp != 0) {
            int digit = temp % 10;
            arm = arm + Math.pow(digit, c);
            temp /= 10;
        }
        
        if(org == arm) {
            System.out.println(org + " is an Armstrong number.");
        } else {
            System.out.println(org + " is not an Armstrong number.");
        }
    }
}
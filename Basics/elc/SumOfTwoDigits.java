package Basics.elc;

import Basics.blc.TwoDigitsSum;

public class SumOfTwoDigits {
    void main(){
        // Taking user input
        IO.println("Enter two numbers : ");
        int num1 = Integer.parseInt(IO.readln());
        int num2 = Integer.parseInt(IO.readln());

        // Assigning answer of getSumOfDeigits() method of class SumOfTwoDigits to sum variable
        int sum = TwoDigitsSum.getSumOfDigits(num1, num2);

        // Calling and printing sum from SumOfTwoDigits class method
        IO.println(sum);
    }
}
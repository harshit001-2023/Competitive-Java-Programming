package Basics.elc;

import Basics.blc.TwoDigitsSum;

public class SumOfTwoDigits {
    void main(){
        IO.println("Enter two numbers : ");
        int num1 = Integer.parseInt(IO.readln());
        int num2 = Integer.parseInt(IO.readln());
        int sum = TwoDigitsSum.getSumOfDigits(num1, num2);
        IO.println(sum);
    }
}
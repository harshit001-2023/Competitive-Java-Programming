package Basics.blc;

public class Calculator {
    public static int add(int num1, int num2){
        return (num1 + num2);
    }
    public static int sub(int num1, int num2){
        return (num1 - num2);
    }
    public static int mul(int num1, int num2){
        return (num1 * num2);
    }
    public static double div(int num1, int num2){
        if(num2 == 0) {
            IO.println("Divide by zero not allowed");
            System.exit(0);
        }
        return (num1 / num2);
    }
}

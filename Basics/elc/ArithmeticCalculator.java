package Basics.elc;

import Basics.blc.Calculator;

import java.util.Scanner;

public class ArithmeticCalculator {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        IO.println("Enter Operation as [ADD/SUB/MUL/DIV] : ");
        String operation = sc.next().toUpperCase();

//        int add = Calculator.add(num1, num2);
//        int sub = Calculator.sub(num1, num2);
//        int mul = Calculator.mul(num1, num2);
//        double div = Calculator.div(num1, num2);
//
//        IO.println("Addition : "+add);
//        IO.println("Subtraction : "+sub);
//        IO.println("Multiplication : "+mul);
//        IO.println("Division : "+div);





        String result = switch(operation){
            case "ADD" -> "Addition = "+Calculator.add(num1, num2);
            case "SUB" -> "Subtraction = "+Calculator.sub(num1, num2);
            case "MUL" -> "Multiplication = "+Calculator.mul(num1, num2);
            case "DIV" -> "Division = "+Calculator.div(num1, num2);
            default -> "Invalid Operation!";
        };

        IO.println(result);

    }
}

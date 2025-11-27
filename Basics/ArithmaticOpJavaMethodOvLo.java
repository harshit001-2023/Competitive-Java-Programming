/*1. ArithmeticOperation
Easy
100 points
• 120 min suggested
Problem Description

Write a Java program that defines a calculation of two numbers with method overloading to perform arithmetic operations.
Implement the followings :

Define the methods :

add(int num1, int num2): Returns the sum of two integers.

add(double num1, double num2): Returns the sum of two doubles.

multiply(int num1, int num2): Returns the product of two integers.

multiply(double num1, double num2): Returns the product of two doubles.

Call these methods from main method.

Test Cases 01 :
------------------
Enter first integer: 12
Enter second integer: 12
Enter first double: 12.25
Enter second double: 25.32

Expected output

Sum of two integer is : 24
Sum of two double is : 37.57
Multiplication of two integer is : 144
Multiplication of two double is : 310.17

Examples
Example 1
Input:
12
12
12.25
25.32
Output:
Sum of two integer is : 24
Sum of two double is : 37.57
Multiplication of two integer is : 144
Multiplication of two double is : 310.17
Explanation:
For Multiplication of two double use given method :- System.out.printf("Multiplication of two double is : %.2f\n", doubleProduct);*/


void main(){
    int a = Integer.parseInt(IO.readln());
    int b = Integer.parseInt(IO.readln());
    double da = Double.parseDouble(IO.readln());
    double db = Double.parseDouble(IO.readln());

    IO.println("Sum of two integer is : "+add(a,b));
    System.out.printf("Sum of two double is : %.2f%n",add(da,db));
    IO.println("Multiplication of two integer is : "+mul(a,b));
    System.out.printf("Multiplication of two double is : %.2f%n",mul(da,db));

}

int add(int a, int b){
    return a+b;
}
int mul(int a, int b){
    return a*b;
}
double add(double da, double db){
    return da+db;
}
double mul(double da, double db){
    return da*db;
}
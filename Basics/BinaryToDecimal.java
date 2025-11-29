/*1. (J-25)Binary_to_Decimal_Conversion
Easy
100 points
• 130 min suggested
Problem Description
Binary to Decimal Conversion (Without Using Array)
Question:
Write a Java program to convert a binary number (e.g., 10101) into its decimal equivalent without using any array.
The input should be taken as an integer, and the program should output the decimal value.

Examples
Example 1
Input:
Input:
1010
Output:
Decimal = 10*/

void main(){
    IO.println("Enter binary digit : ");
    int number = Integer.parseInt(IO.readln());
    int decimal = 0, i = 0;

    while(number!=0){
        int temp = number % 10;
        if(number < 0){
            IO.println("Invalid Input! Binary number cannot be negative.");
            System.exit(0);
        }
        if(temp != 1 && temp != 0){
            IO.println("Invalid Binary Number! Only 0 and 1 are allowed.");
            System.exit(0);
        }
        else {
            decimal = decimal + (int)(Math.pow(2,i))*temp;
            number/=10;
        }
        i++;
    }

    IO.println("Decimal = "+decimal);
}
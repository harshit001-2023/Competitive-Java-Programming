/*3. (J-25)GreatestCommonDivisor (GCD)
Easy
100 points
• 130 min suggested
Problem Description
Write a Java program to find the Greatest Common Divisor (GCD) of two given numbers.
Do not use any built-in library method.

The program should display the GCD of the two integers entered by the user.

Examples
Example 1
Input:
Input:
20
28
Output:
GCD = 4*/

void main(){
    int num = Integer.parseInt(IO.readln());
    int num1 = Integer.parseInt(IO.readln());

    if(num <= 0 || num1 <= 0){
        IO.println("Invalid Input! Numbers must be greater than zero.");
    }
    else{
        int temp = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0 && num1 % i == 0){
                temp = i;
            }
        }
        IO.println("GCD = "+temp);
    }
}
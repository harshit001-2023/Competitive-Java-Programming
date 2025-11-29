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
    // Taking Input
    IO.println("Enter binary digit : ");
    int number = Integer.parseInt(IO.readln());
    int decimal = 0, i = 0;

    // Edge case number should no be less than 0
    if(number < 0){
        IO.println("Invalid Input! Binary number cannot be negative.");
        System.exit(0);
    }else {
        // Runs upto number is not Zero
        while(number!=0){
            // Extracting each number
            int digit = number % 10;

            // Digit should not be other than zero and 1 means binary
            if(digit != 1 && digit != 0){
                IO.println("Invalid Binary Number! Only 0 and 1 are allowed.");
                System.exit(0);
            }
            else {
                // Else convert into decimal
                // By using the logic
                // 1010 => (1*2^3)+(0*2^2)+(1*2^1)+(0*2^0)
                //      => 8 + 0 + 2 + 0 => 10
                decimal = decimal + (int)(Math.pow(2,i))*digit;
                number/=10;
            }
            // increment i
            i++;
        }
    }

    IO.println("Decimal = "+decimal);
}
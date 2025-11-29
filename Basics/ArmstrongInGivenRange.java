/*2. (J-25)Armstrong _Numbers_Range
Easy
100 points
• 130 min suggested
Problem Description
Armstrong Numbers in a Range
Write a Java program to display all Armstrong numbers within a given range.
A number is said to be an Armstrong number if the sum of the cubes of its digits (for 3-digit numbers) or the sum of each digit raised to the power of the total number of digits is equal to the number itself.
Your program should take a starting range and an ending range as input and print all Armstrong numbers between them.

[In test cases: first value belongs to starting range and second value belongs to ending range]

Examples
Example 1
Input:
Input:
100
500
Output:
153 370 371 407*/

void main(){
    //Taking wo integer input from user
    IO.println("Enter two numbers : ");
    int num = Integer.parseInt(IO.readln());
    int num1 = Integer.parseInt(IO.readln());

    // Edge case for range small to big
    if(num > num1) IO.println("Invalid Range! Start value must be smaller than End value.");
    else if(num < 0 && num1 < 0) { // Number should not be smaller than Zero
        IO.println("Invalid input, negative inputs are not allowed.");
    }else if((num < 100 || num > 1000) && (num1 < 100 || num > 1000)) {
        // Number should be in range of 100 and 1000
        IO.println("Range must be in between three digit.");
    } else{
        //Following the range
        for(int i = num; i < num1; i++){
            int temp2 = i, arm = 0; // Declaring and initializing a temp and arm variable

            // Checking whether the is armstrong or not checking each number one by one
            while (temp2 != 0){
                int num2 = temp2 % 10;
                arm = arm + (int)(Math.pow(num2,3));
                temp2 /= 10;
            }
            //checking whether the armstrong matches to the number or not
            if(i == arm) IO.print(" "+arm);
        }
    }
}
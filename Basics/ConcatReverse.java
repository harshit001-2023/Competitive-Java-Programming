/*
Problem Description
1) Write a java program to overload methods as follows:
	1) void concatenate(String s) method to concatenate the given string.
	2) void reverse(int i) method to reverse the digits

Example 1
Input:
Hello
123
Output:
Concatenated String: Hello - concatenated!
Reversed Number of 1234 is: 4321
*/

void main(){
    // Taking user input String and Integer to Reverse
    String s = IO.readln();
    int a = Integer.parseInt(IO.readln());

    // Calling Both the methods
    concatenate(s);
    reverse(a);
}

void concatenate(String s){
    // Method for concatenations simply print
    IO.println("Concatenated String: "+s+" - concatenated!");
}
void reverse(int i){
    // Preventing original value
    int org = i;
    //Initializing reverse
    int rev = 0;
    // Logic for reverse
    while(i > 0){
        int temp = i % 10; // 123 % 10 = 3, 12 % 10 = 2, 1
        rev = rev * 10 + (temp); // 0*10+3, 3*10+2, 32*10+1, 321
        i/=10; // 12.3, 1.2, 0
    }

    // Printing
    IO.println("Reversed Number of "+org+" is: "+rev);
}

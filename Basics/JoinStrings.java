/*Problem Description
2) Write a java program to create a method that takes a variable number of string arguments(varargs parameter) and concatenates them into a
single string, separated by a space & return.

Examples
Example 1
Input:
Hello
World
Output:
Hello World*/

void main(){
    // Taking User input
    int num = Integer.parseInt(IO.readln());
    // Calling the method
    argument(num);
}

void argument(int ...num) {
    // Initializing a temp variable for future use
    String temp = "";

    // Initialized a count variable and counted element in the array
    int totalStrings = 0;
    // num[] = {1, 2, 3, 4}
    for (int n : num) { // n = 1, 2, 3, 4
        totalStrings += n; // totalString = 0 + 1= 1 + 2= 3 + 4= 7
    }
    for (int i = 0; i < totalStrings; i++) {
        String arg = IO.readln(); // Taking string input
        temp = temp + arg + " "; // null + arg + " " = arg + arg1 + " " = arg arg1 + arg2 + " " = ...
    }
    // Printing
    IO.println("Concatenated String: "+temp);
}
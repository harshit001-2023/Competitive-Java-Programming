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
    int num = Integer.parseInt(IO.readln());
    argument(num);
}

void argument(int ...num) {
    String temp = "";

    int totalStrings = 0;
    for (int n : num) {
        totalStrings += n;
    }
    for (int i = 0; i < totalStrings; i++) {
        String arg = IO.readln();
        temp = temp + arg + " ";
    }
    IO.println("Concatenated String: "+temp);
}
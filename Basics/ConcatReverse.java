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
    String s = IO.readln();
    int a = Integer.parseInt(IO.readln());
    concatenate(s);
    reverse(a);
}

void concatenate(String s){
    IO.println("Concatenated String: "+s+" - concatenated!");
}
void reverse(int i){
    int org = i;
    int rev = 0;
    while(i > 0){
        int temp = i % 10; // 123 % 10 = 3, 12 % 10 = 2
        rev = rev * 10 + (temp); // 30 + 20 + 10
        i/=10;
    }
    IO.println("Reversed Number of "+org+" is: "+rev);
}

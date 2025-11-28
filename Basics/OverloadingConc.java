/*1. Understanding Overloading(J-25)
Easy
100 points
• 130 min suggested
Problem Description
Create  two methods having the same name but different sequence of the integer and the character parameters.

For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).

Input Format:
----------------
Enter an integer:
Enter a character:
Enter a character:
Enter an integer:

Output Format:
------------------
int=66 char=A
int=67 char=D

Examples
Example 1
Input:
66
A
D
67
Output:
int=66 char=A
int=67 char=D*/


void main(){
    int num1 = Integer.parseInt(IO.readln());
    char num2 = IO.readln().charAt(0);
    char num3 = IO.readln().charAt(0);
    int num4 = Integer.parseInt(IO.readln());
    method(num1,num2);
    method(num3, num4);

}
void method(int num1, char num2){
    IO.println("int="+num1+" char="+num2);
}
void method(char num3, int num4){
    IO.println("int="+num4+" char="+num3);
}


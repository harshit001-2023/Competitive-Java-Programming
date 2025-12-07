/*
Program 02:
-----------
Write a Java program to find Largest of Three Numbers.
*/


void main(){
    // Taking three Integers as input
	IO.print("Enter three values : ");
	int a = Integer.parseInt(IO.readln());
	int b = Integer.parseInt(IO.readln());
	int c = Integer.parseInt(IO.readln());

    // Logic for Checking which among the three integers is greater
	if(a > b && a > c) IO.println(a+" is Greater."); // First comparing a with b, then a with c if a greater than both then a greater
	else if(b > a && b > c) IO.println(b+" is Greater."); // First comparing b with a, then a with b if c greater than both then a greater
	else IO.println(c+" is Greater."); // Now if no above conditions are true then obviously c is greater
}
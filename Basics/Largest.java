/*
Program 02:
-----------
Write a Java program to find Largest of Three Numbers.
*/


void main(){
	IO.print("Enter three values : ");
	int a = Integer.parseInt(IO.readln());
	int b = Integer.parseInt(IO.readln());
	int c = Integer.parseInt(IO.readln());
	
	if(a > b && a > c) IO.println(a+" is Greater.");
	else if(b > a && b > c) IO.println(b+" is Greater.");
	else IO.println(c+" is Greater.");
}
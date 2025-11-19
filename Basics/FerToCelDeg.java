/*
Program 05 :
-------------
Write a program in java to Fahrenheit to Celsius Program
Formula is :-  celsius=((fahrenheit-32)*5)/9;
*/

void main(){
	IO.println("Enter Fahrenheit : ");
	int fahrenheit = Integer.parseInt(IO.readln());
	IO.println("Cel : "+((fahrenheit-32)*5)/9);
}
/*
Assignment 03 :
---------------
WAP to read your salary from keyword with user input message ("Enter your Salary :").
Display your salary in the console.
Print a message based on the Salary :
 * If Salary is greater than 50000, Your bonus amount is 5000 else 3000.
   Print the bonus amount and total salary.

Output :
Enter your Salary : 48000
Your Salary     : 48000.0
Your Bonus      : 3000.0
Total Salary    : 51000.0
*/

void main(){
	var sal = Integer.parseInt(IO.readln("Enter your Salary : "));
	
	IO.println("Your Salary : "+sal);
	if(sal > 50000) IO.println("Your bonus amount : 5000\nTotal sal : "+(sal+5000));
	else IO.println("Your bonus amount : 3000\nTotal sal : "+(sal+3000));
}
/*
Program 07:
-----------
Write a Java program to check if a given number is a palindrome or not. 
A number is a palindrome if it remains the same when its digits are reversed.

*/

void main(){
	IO.print("Enter a Num : ");
	int num = Integer.parseInt(IO.readln());
	int org = num;
	int rev = 0;
	
	
	while (num != 0) {
		int digit = num % 10;
		rev = rev * 10 + digit;
		num = num / 10;
	}
	
	if (org == rev) {
		IO.println(org + " is a palindrome.");
	} else {
		IO.println(org + " is not a palindrome.");
	}
	
}
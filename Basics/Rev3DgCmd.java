/**
* 1) WAP Reverse of a 3 digit number without using loop
*    take the number from readln() method.
*/

void main(){
	IO.println("Enter 3 dg number");
	//String num = IO.readln();
	int a = Integer.parseInt(IO.readln());
	//123
	int rev = (a%10) * 100 + ((a/10)%10)*10 + (a/100);
	
	IO.println(rev);
	
}
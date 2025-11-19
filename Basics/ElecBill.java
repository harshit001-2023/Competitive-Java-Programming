/*
Program 06 :
-------------
A local electricity board wants to calculate monthly bills.
Store the number of units consumed using a short.
Use an int to store and calculate the bill amount.
Apply the following tariff:
Up to 100 units → ₹5/unit
101–300 units → ₹7/unit
Above 300 units → ₹10/unit
Add a fixed charge of ₹50.
*/

void main(){
	
	IO.println("Enter unit : ");
	short units = Short.parseShort(IO.readln());
	int bill_amt;
	final int charg = 50;
	
	
	if(units <= 100){
		bill_amt = units * 5;
		IO.println("Bill unit = "+(bill_amt + charg));
	}else if(units <= 300){
		bill_amt = 100 * 5 + ((units -100) * 7);
		IO.println("Bill unit = "+(bill_amt + charg));
	}else{
		
		bill_amt = 100 * 5 + 200 * 7 + ((units - 300) * 10) + charg;
		IO.println("Bill unit = "+(bill_amt));
	}
}
/*
Assignment 04 :
----------------
WAP to read your boolean value from keyword with user input message ("Enter true OR false :").
Based on the input give the follwing message.

Enter 'true OR false' :true
You entered true

Enter 'true OR false' :false
You entered false
*/

void main(){
	
	 boolean userInput = Boolean.parseBoolean(IO.readln("Enter true OR false :"));
     IO.println("You entered " + userInput);
}
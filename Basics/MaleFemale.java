/*
Assignment 04 :
----------------
WAP to read your gender from keyword with user input message ("Enter your Gender[M/F] :").
Based on the gender give the follwing message.

Output format :

Enter your Gender :Male
Your gender is :M
Welcome Sir

Enter your Gender :Female
Your gender is :F
Welcome Madam
*/

void main(){
    // Asking user to enter their gender
	String gender = IO.readln("Enter your Gender[M/F] :");

    // Checking whether their gender is Male or Female
	if(gender.charAt(0) == 'M' || gender.charAt(0) == 'm'){ 
		IO.println("Your gender is :M\nWelcome Sir");
		}
	else if(gender.charAt(0) == 'F' || gender.charAt(0) == 'f'){ 
		IO.println("Your gender is :F\nWelcome Madam");
		}
	else {
		IO.println("Your gender is : "+gender+"\nWelcome");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	String gender = IO.readln("Enter your Gender[M/F] :");
	
	if(gender.toUpperCase().equals("MALE")){ 
		IO.println("Your gender is :M\nWelcome Sir");
		}
	else if(gender.toUpperCase().equals("FEMALE")){ 
		IO.println("Your gender is :F\nWelcome Madam");
		}
	else {
		IO.println("Your gender is : "+gender+"\nWelcome");
		}
*/
}
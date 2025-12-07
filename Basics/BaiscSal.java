/*
Program 04:
-----------
Write a program to input the basic salary of a person. He gets 15% of the basic as HRA, 
15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance. 
The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. 
Calculate and print the total salary of person.

*/

void main(){
	IO.println("Enter Sal : ");
	double b_sal = Integer.parseInt(IO.readln());
	double hra_per = (b_sal*15)/100, con_per = (b_sal*15)/100, ent_per = (b_sal*10)/100;
	IO.println("Basic HRA = " +hra_per);
	IO.println("Basic HRA = " +con_per);
	IO.println("Basic HRA = " +ent_per);
	IO.println("Basic HRA = " +(b_sal+hra_per+con_per+ent_per));
}
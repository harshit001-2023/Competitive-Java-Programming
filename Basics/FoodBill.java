/*
Program 01:
-----------
Write a  program in Java that will generate and print the bill at Dominos for four chicken rolls 
(@ Rs 60 per chicken rolls) and three vegetable puffs (@ Rs 25 per vegetable puffs). 
There is a special discount of Rs 50 on the final bill amount. Calculate and print final bill as well as all item bill.
*/


void main(){
	int chikens = 4, veg_puffs = 3, dis_amt = 50;
	IO.println("4 Chikens + 3 veg puffs - 50rs discount = " +((chikens * 60) + (veg_puffs * 25) - dis_amt)+"Rs");
	
}
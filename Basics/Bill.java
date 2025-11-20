/*
* 2) WAP to calculate telephone bill 
* For 100 free call rental = 360 [eixed charge]
* For 101 - 250, 1 Rs per call
* For 251 - unlimited , 1.2 Rs per call
* Calculate the final bill
*/


void main(){
	IO.println("Calls : ");
	//String num = IO.readln();
	int a = Integer.parseInt(IO.readln());
	
	if(a <= 100)
		IO.println("Call rental 360");
	else if(a <= 250) IO.println("Call rent : "+(a*1));
	else IO.println("Call rent "+(a*1.2));

}
package Basics;

class  BasicOp
{
	public static void main(String[] args) 
	{
		int add, sub, mul, num1 = 10, num2 = 5;
		double	div;
		
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		
		IO.println("Addition : " +add);
		IO.println("Subtraction : "+sub);
		IO.println("Multiplication : "+mul);	
		IO.println("Divsion : "+div);
	}
}

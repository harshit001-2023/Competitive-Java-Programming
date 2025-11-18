void main(String []x){
	int a = Integer.parseInt(x[0]);
	int b = Integer.parseInt(x[1]);
	int c = Integer.parseInt(x[2]);
	
	int sum = a+b+c;
	float avg = sum/3;
	
	IO.println("Sum = "+sum);
	IO.println("Average is "+avg);
}
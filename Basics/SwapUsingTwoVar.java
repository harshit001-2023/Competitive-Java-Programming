void main(String []x){
	int a = Integer.parseInt(x[0]);
	int b = Integer.parseInt(x[1]);
	a = a + b;
	b = a - b;
	a = a - b;
	IO.println(a+ " " +b);
}
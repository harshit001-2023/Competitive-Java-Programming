void main(String []x){
	int a = Integer.parseInt(x[0]);
	int fact = 1;
	
	for(int i = 1; i <= a; i++){
		fact = fact * i;
	}
	IO.println(fact);
}
void main(String []x){
	int a = Integer.parseInt(x[0]), count = 0;
	
	for(int i = 1; i<=a; i++){
		if(a%i==0) count++;
	}
	if(count == 2) IO.println("Prime");
	else IO.println("Not Prime");
}
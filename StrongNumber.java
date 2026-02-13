void main(){
    int num = 145, org = num;
    long sum = 0;

    while(num > 0){
        int digit = num%10;
        long fact = 1;
        for(int j = 1; j <= digit; j++){
            fact*=j;
        }
        sum+=fact;
        num/=10;
    }
    IO.println(sum);
    if(sum == org){
        IO.println("Matched");
    } else IO.println("NO match");
}
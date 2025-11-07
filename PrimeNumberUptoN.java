import java.util.Scanner;

public class PrimeNumberUptoN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        if (num <= 1){
            System.out.println("Invalid");
        }else{
            System.out.println("Prime no from 1 - "+num);
            for(int i = 2; i <= num; i++){
                int isPrime = 1;
                for (int j = 2; j * j <= i; j++){
                    if (i%j==0) {
                        isPrime = 0;
                        break;
                    }
                }
                if (isPrime == 1) System.out.print(i+" ");

            }
        }


    }
}

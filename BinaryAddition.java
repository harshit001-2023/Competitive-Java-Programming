import java.util.*;

public class BinaryAddition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long binary1, binary2;
        int i = 0, remainder = 0;

        System.out.println("Enter first Binary Number");
        binary1 = sc.nextLong();
        System.out.println("Enter second Binary Number");
        binary2 = sc.nextLong();

        int[] sum = new int[20];

        while(binary1 != 0 || binary2 != 0){
            sum[i++] = (int)(binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (int)(binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 /10;
            binary2 = binary2 / 10;
        }

        if(remainder != 0){
            sum[i++] = remainder;
        }

        i--;
        System.out.println("Binary sun = ");
        while(i >= 0){
            System.out.print(sum[i--]);
        }

        System.out.println("\n");

    }
}
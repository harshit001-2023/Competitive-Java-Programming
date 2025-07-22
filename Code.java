import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Code{
    static void swap(int a, int b){
        //Type1
        // int c = a;
        // a=b; b=c;
        //Type2
        // a = a-b;
        // b = a+b;
        // a = b-a;
        //Type3
        a = (a+b)-(b=a);
        System.out.print(a +" ");
        System.out.println(b);
    }
    static void DigitSum(int a){
        int sum=0;

        while(a!=0){
            int digit = a % 10; System.out.println("Digit =" +digit);
            sum = sum + digit; System.out.println("sum =" +sum);
            a = a / 10; System.out.println("a =" +a);
        }
       
        System.out.println(sum);
    }
    static void Reverse(int a){
        int reversed = 0;

        while(a!=0){
            int digit = a % 10; //System.out.println(digit);
            reversed = reversed * 10 + digit; //System.out.println(reversed);
            a = a / 10; //System.out.println(a);
        }
        System.out.println(reversed);
    }
    static void Palindrome(int a){
        int original = a;
        int reversed = 0;
         while(a!=0){
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a = a / 10;
         }

         if(original == reversed){
            System.out.println("True");
         } else {
            System.out.println("False");
         }
    }
    static void Armstrong(int a){
        //First time I wrote a correct program
        int original = a;
        int sumCube = 0;
        int count = 0;
        int temp = a;

        while(temp > 0){
            temp = temp / 10;
            count++; 
            // System.out.println(count);
        }

        temp = a;

        while(temp>0){
            int digit = temp % 10;
            sumCube += Math.pow(digit, count);
            temp = temp /10;
        }
        
        if(original == sumCube){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
    static void FibonacciSeries(int a){
        int first = 0;
        int second = 1, third = 0; 
        System.out.println(first);       
        System.out.println(second);       
        
        for(int i = 0; i <=a; i++){
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        } 
    }
    static void CountDigits(int a){
        int count = 0;

        while(a!=0){
            a = a / 10;
            count++; //System.out.println(a);
        }

        System.out.println(count);
    }
    static void DigitFreq(int a){
        int original = a;

        for (int i = 0; i < 10; i++) {
            int count = 0; // Reset count for each digit
            int digit = a % 10;
            a = a / 10;
            
            int temp = original; // Use a temporary variable to iterate through the original aber
            while (temp > 0) {
                int match = temp % 10;
                if (digit == match) {
                    count++;
                }
                temp = temp / 10; // Update temp to avoid infinite loop
            }
            System.out.println(digit + " = " + count);
        }
    }
    static void LargestDigit(int a){
        //Chat GPT gave me 7/10 for this


        int original,temp = 0;
        

        while(a!=0){ //a=123456
            original = a;
            // int digit = a % 10; //6
            // System.out.println(digit);
            a = a/10; //12345.6
            
            while(original!=0){ //original=123456
                int currentDigit = original % 10; //6
                // System.out.println(currentDigit);              

                if(temp <= currentDigit){
                    temp = currentDigit;//temp = 6
                    // System.out.println(temp);
                } 
                original = original / 10; //12345.6
                // System.out.println(original);
            }
            
        }
        System.out.println(temp);
    }
    static void LargestDigit1(int a) {
        //This is the effecient code given by GPT

        int largestDigit = 0;

        while(a != 0){
            int digit = a % 10;
            
            if(digit > largestDigit){
                largestDigit = digit;
            }
            a=a/10;
        }System.out.println(largestDigit);
    }
    static void EvenSum(int a){
        int sum = 0;

        while(a>0){
            int digit = a % 10; //System.out.println(digit);

            if(digit%2==0){
                sum = sum + digit;
            }
            a = a/10;
        }System.out.println("Sum = "+sum);
    }
    static void DiffSumOddEven(int a){
        int esum = 0, osum = 0;
        
        while(a>0){
            int digit = a % 10;

            if(digit%2==0){
                esum = esum + digit;
            } else{
                osum = osum + digit;
            }
            a = a/10;
        } 
        int diff = esum - osum;
        System.out.println(diff);
    }
    static void AccendDigit(int a){
        //With Arrays
        String temp = Integer.toString(a);
        char[] arr = temp.toCharArray();
        Arrays.sort(arr);
        String SortedString = new String(arr);
        int sortaber = Integer.parseInt(SortedString);

        System.out.println(sortaber);
    }
    static void AccendDigit1(int a){

        int[] count = new int[10];

        while(a>0){
            int digit = a % 10;
            count[digit]++;
            a = a/10;
        }

        int sortedaber = 0;
        for(int i = 0; i<10; i++){
            while(count[i]>0){
                sortedaber = sortedaber * 10 + i; System.out.println(sortedaber);
                count[i]--;
            }
        }System.out.println(sortedaber);
    }
    static int RemoveDigit(int a){
        int result = 0;
        int place = 1;
        int digitToRemove = 3;
        
        while (a > 0) {
            int digit = a % 10; //System.out.println(digit);
            if (digit != digitToRemove) {
                result = digit * place + result; System.out.println(result);
                place *= 10; System.out.println(place); 
            }
            a /= 10; //System.out.println(a);
        }
        
        return result;
    }
    static void ReplaceDigit(int a){
       int result = 0;
       int place = 1;
       int DigitToReplace = 3;
       int ReplacingDigit = 4;

       while(a>0){
        int digit = a % 10;
        
        if(digit != DigitToReplace){
            result = digit * place + result;
            place = place * 10;
        } else{
            digit = ReplacingDigit;
            result = digit * place + result;
            place = place * 10;
        }
        a = a / 10;
        
       } 
       System.out.println(result);
    }
    static void SecondLargestDigit(int a) {
        //13. Replace Digit
        int count[] = new int[10];

        // Count the frequency of each digit
        while (a > 0) {
            int digit = a % 10;
            count[digit]++;
            a /= 10;
        }

        // Find the largest and second largest digits
        int largest = -1, secondLargest = -1;
        for (int i = 9; i >= 0; i--) {
            if (count[i] > 0) {
                if (largest == -1) {
                    largest = i;
                } else if (secondLargest == -1) {
                    secondLargest = i;
                    break;
                }
            }
        }

        // Print the second largest digit
        if (secondLargest != -1) {
            System.out.println(secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
    }
    static void SecondLargestDigit1(int a){
        //14. Second Largest Digit 
        int second = 0, high = 0;

        while(a>0){
            int digit = a % 10;
            
            if(digit > high){
                second = high;
                high = digit;
            } else{
                if(digit > second && digit !=high){
                    second = digit;
                }
            }
            a = a / 10;
        }System.out.println(second);

    }
    static void IncrementByOne(int a){
        // 15. Increment Digit by 1
        int aber = 0;

        
        while(a>0){
            if(a!=0){
            int digit = a % 10 + 1; //1234 % 10 = 4
            // System.out.println(digit); 
            aber = aber * 10 + digit;
            a = a / 10;
            }
        }System.out.println(aber);
    }
    static void NeighborPowerSum(int a){
        //16. Sum of Digits with Power of Neighbor Digit
        int sum = 0, first = a;
        int lastDigit = (a % 10); //4
        int temp = lastDigit;
        a/=10; //123


        while(a>0){
            int digit = a % 10; //3
            // System.out.println(digit);
            int power = (int)Math.pow(digit, lastDigit);
            // System.out.println(power);
            sum = sum + power;
            lastDigit = digit;
            a = a / 10;
        }
        while(first >=10){
            first/=10;
        }
        int power = (int)Math.pow(temp, first);
        // System.out.println(power);
        // System.out.println(temp);
        sum = sum + power;

        System.out.println(sum);
    }
    static void OddEvenDigits(int a){
        // 17. Count Even Digits and Odd Digits
        int countEven = 0, countOdd = 0;
        if(a < 0){
            System.out.println("Error");
        }

        while(a>0){

            int digit = a % 10;
                if(digit%2==0){
                    countEven++;
                } else{
                    countOdd++;
                }
            a/=10;

        }
        System.out.print("Even digit = " +countEven);
        System.out.println(" Odd digit = " +countOdd);
    }
    static void DuplicateDigit(int a){
        //18. Print Duplicate Digit in a aber
        int[] digitCounts = new int[10]; // Array to store count of each digit

        while (a != 0) {
            int digit = a % 10;
            digitCounts[digit]++; // Increment count for current digit
            a/= 10;
        }
    
        for (int i = 0; i < 10; i++) {
            if (digitCounts[i] > 1) { // Check if digit appears more than once
                System.out.println("Digit " + i + " appears " + digitCounts[i] + " times");
            }
        }
    }
    static void ProductOfDigitsDivisibleByN(int a, int b){
        //19. Product of digits divisible by n 
        //a = 123, n = 3
        //Example : 123 = 6/3 = 2
        int product = 1;

        while(a>0){
            int digit = a % 10;
            product *= digit;
            a = a / 10;

        }
        System.out.println((product % b == 0) ? (product / b) : "Not Divisible!");

    }
    static void isPrime(int a) {
        if (a <= 1) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
    static void DiffBetLargestSmallestDigit(int a){
        //21. Find the Difference Between the Largest and Smallest Digits in a Number 
        int largest = 0, smallest = 9, difference = 0;

        while(a>0){
            int digit = a % 10;
            if(digit > largest){
                largest = digit;
            } 
            if(digit < smallest){
                smallest = digit;
            }
            
            a = a / 10;
        }
        difference = largest - smallest;
            System.out.print(difference);
    }
    static void DiffBetLargestSmallestDigit1(int a){
        //21. Find the Difference Between the Largest and Smallest Digits in a Number 
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;

        while (a > 0) {
            int digit = a % 10;
            largest = Math.max(largest, digit);
            smallest = Math.min(smallest, digit);
            a = a / 10;
        }
        System.out.println(largest - smallest);
    }
    static void PrintUniqueDigitInNumber(int a){
        //22. Print Unique Digit in number
            int count[] = new int[10];

        while(a>0){
            int digit = a % 10;
            count[digit]++;
            a /= 10;            
        }

        for(int i = 0; i < 10; i++){
            if(count[i] == 1){
                System.out.print(i);
            }
        }
    }
    static void SumOfDigitIPrime(int a){
        //23. Check if the Sum of Digits of a Number is Prime
        int digitSum = 0;

        while(a>0){
            int digit = a % 10;
            digitSum = digit + digitSum;
            a = a/10;
            }  

        if(digitSum <= 1){
            System.out.println("Not Prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= digitSum; i++) {
            if (digitSum % i == 0) {
                isPrime = false;
                break; // Exit loop early
            }
        }
    
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }



    public static void main(String args[]){
        try{
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch(Exception e){
            System.out.println("Error");
        }

        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			// int b = sc.nextInt();//1
			// swap(a, b);//2
            // DigitSum(a);//3
            // Reverse(a);//4
            // Palindrome(a);//5
            // Armstrong(a);//6
            // FibonacciSeries(//7a);
            // CountDigits(a);//8
            // DigitFreq(a);//9
            // LargestDigit(a);//10
            // LargestDigit1(a);//11
            // EvenSum(a);//12
            // DiffSumOddEven(a);//13
            // AccendDigit(a);//14
            // AccendDigit1(a);//15
            // RemoveDigit(a);//16
            // ReplaceDigit(a);//17
            // SecondLargestDigit(a);//18
            // SecondLargestDigit1(a);//19
            // IncrementByOne(a);//20
            // NeighborPowerSum(a);//21
            // OddEvenDigits(a);//22
            // DuplicateDigit(a);//23
            // ProductOfDigitsDivisibleByN(a, b);//24
            // isPrime(a);//25
            // DiffBetLargestSmallestDigit(a);//26
            // DiffBetLargestSmallestDigit1(a);//27
            // PrintUniqueDigitInNumber(a);//28
            SumOfDigitIPrime(a);//29
		}
		sc.close();
    }
}

